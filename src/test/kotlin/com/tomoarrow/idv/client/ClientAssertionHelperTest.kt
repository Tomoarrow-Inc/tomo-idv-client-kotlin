package com.tomoarrow.idv.client

import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.ShouldSpec
import java.security.KeyPairGenerator
import java.security.Signature
import java.security.interfaces.ECPrivateKey
import java.security.interfaces.ECPublicKey
import java.security.spec.ECGenParameterSpec
import java.util.Base64
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.long

class ClientAssertionHelperTest : ShouldSpec() {

    private val base64UrlEncoder: Base64.Encoder = Base64.getUrlEncoder().withoutPadding()
    private val base64UrlDecoder: Base64.Decoder = Base64.getUrlDecoder()
    private val json = Json { ignoreUnknownKeys = true }

    /** Generate a P-256 key pair and encode the private key as a Base64URL JWK. */
    private fun generateTestKeyPair(): Triple<String, ECPrivateKey, ECPublicKey> {
        val kpg = KeyPairGenerator.getInstance("EC")
        kpg.initialize(ECGenParameterSpec("secp256r1"))
        val kp = kpg.generateKeyPair()

        val privateKey = kp.private as ECPrivateKey
        val publicKey = kp.public as ECPublicKey

        val w = publicKey.w
        val xBytes = toUnsignedByteArray(w.affineX, 32)
        val yBytes = toUnsignedByteArray(w.affineY, 32)
        val dBytes = toUnsignedByteArray(privateKey.s, 32)

        val jwk = buildString {
            append("{")
            append("\"kty\":\"EC\",")
            append("\"crv\":\"P-256\",")
            append("\"x\":\"${base64UrlEncoder.encodeToString(xBytes)}\",")
            append("\"y\":\"${base64UrlEncoder.encodeToString(yBytes)}\",")
            append("\"d\":\"${base64UrlEncoder.encodeToString(dBytes)}\"")
            append("}")
        }

        val secretKey = base64UrlEncoder.encodeToString(jwk.toByteArray(Charsets.UTF_8))
        return Triple(secretKey, privateKey, publicKey)
    }

    /**
     * Convert a BigInteger to an unsigned byte array of the given length, left-padded with zeros
     * if needed.
     */
    private fun toUnsignedByteArray(value: java.math.BigInteger, length: Int): ByteArray {
        val bytes = value.toByteArray()
        return when {
            bytes.size == length -> bytes
            bytes.size > length -> {
                // Strip leading zero byte (sign byte)
                val offset = bytes.size - length
                bytes.copyOfRange(offset, bytes.size)
            }
            else -> {
                // Left-pad with zeros
                val padded = ByteArray(length)
                val offset = length - bytes.size
                System.arraycopy(bytes, 0, padded, offset, bytes.size)
                padded
            }
        }
    }

    init {
        val clientId = "test-client-id"
        val baseUrl = "https://api.example.com"

        should("createClientAssertion returns a valid 3-part JWT") {
            val (secretKey, _, publicKey) = generateTestKeyPair()
            val options = ClientAssertionOptions(
                clientId = clientId,
                secretKey = secretKey,
                baseUrl = baseUrl,
            )
            val jwt = ClientAssertionHelper.createClientAssertion(options)
            val parts = jwt.split(".")
            parts.size shouldBe 3
        }

        should("JWT header has alg=ES256 and typ=JWT") {
            val (secretKey, _, _) = generateTestKeyPair()
            val options = ClientAssertionOptions(
                clientId = clientId,
                secretKey = secretKey,
                baseUrl = baseUrl,
            )
            val jwt = ClientAssertionHelper.createClientAssertion(options)
            val headerJson = String(base64UrlDecoder.decode(jwt.split(".")[0]), Charsets.UTF_8)
            val header = json.parseToJsonElement(headerJson) as JsonObject
            header["alg"]!!.jsonPrimitive.content shouldBe "ES256"
            header["typ"]!!.jsonPrimitive.content shouldBe "JWT"
        }

        should("JWT payload contains correct claims") {
            val (secretKey, _, _) = generateTestKeyPair()
            val options = ClientAssertionOptions(
                clientId = clientId,
                secretKey = secretKey,
                baseUrl = baseUrl,
            )
            val jwt = ClientAssertionHelper.createClientAssertion(options)
            val payloadJson = String(base64UrlDecoder.decode(jwt.split(".")[1]), Charsets.UTF_8)
            val payload = json.parseToJsonElement(payloadJson) as JsonObject

            payload["iss"]!!.jsonPrimitive.content shouldBe clientId
            payload["sub"]!!.jsonPrimitive.content shouldBe clientId
            payload["aud"]!!.jsonPrimitive.content shouldBe "$baseUrl/v1/oauth2/token"

            val iat = payload["iat"]!!.jsonPrimitive.long
            val exp = payload["exp"]!!.jsonPrimitive.long
            (exp - iat) shouldBe 300

            payload["jti"]!!.jsonPrimitive.content shouldNotBe ""
        }

        should("JWT signature is verifiable with the public key") {
            val (secretKey, _, publicKey) = generateTestKeyPair()
            val options = ClientAssertionOptions(
                clientId = clientId,
                secretKey = secretKey,
                baseUrl = baseUrl,
            )
            val jwt = ClientAssertionHelper.createClientAssertion(options)
            val parts = jwt.split(".")
            val signingInput = "${parts[0]}.${parts[1]}"
            val signatureBytes = base64UrlDecoder.decode(parts[2])

            val verifier = Signature.getInstance("SHA256withECDSAinP1363Format")
            verifier.initVerify(publicKey)
            verifier.update(signingInput.toByteArray(Charsets.UTF_8))
            verifier.verify(signatureBytes) shouldBe true
        }

        should("buildTokenRequest returns correct headers") {
            val result = ClientAssertionHelper.buildTokenRequest("test-assertion")
            result.headers["Content-Type"] shouldBe "application/x-www-form-urlencoded"
        }

        should("buildTokenRequest returns URL-encoded body with all fields") {
            val assertion = "test-assertion-value"
            val result = ClientAssertionHelper.buildTokenRequest(assertion)
            val body = result.body

            body.contains("grant_type=client_credentials") shouldBe true
            body.contains("scope=idv.read") shouldBe true
            body.contains("client_assertion_type=") shouldBe true
            body.contains("client_assertion=test-assertion-value") shouldBe true
        }

        should("buildTokenRequest respects custom BodyOptions") {
            val customOptions = BodyOptions(
                grantType = "custom_grant",
                scope = "custom.scope",
                resource = "https://custom.resource",
                clientAssertionType = "custom-type",
            )
            val result = ClientAssertionHelper.buildTokenRequest("jwt", customOptions)
            val body = result.body

            body.contains("grant_type=custom_grant") shouldBe true
            body.contains("scope=custom.scope") shouldBe true
            body.contains("client_assertion=jwt") shouldBe true
        }

        should("jwkToECPublicKey reconstructs a valid public key from JWK") {
            val (secretKey, _, originalPublicKey) = generateTestKeyPair()
            val jwk = ClientAssertionHelper.decodeBase64UrlToJwk(secretKey)
            val reconstructedPublicKey = ClientAssertionHelper.jwkToECPublicKey(jwk)

            reconstructedPublicKey.w.affineX shouldBe originalPublicKey.w.affineX
            reconstructedPublicKey.w.affineY shouldBe originalPublicKey.w.affineY
        }
    }
}
