package com.tomoarrow.idv.client

import java.math.BigInteger
import java.net.URLEncoder
import java.security.AlgorithmParameters
import java.security.KeyFactory
import java.security.Signature
import java.security.interfaces.ECPrivateKey
import java.security.spec.ECGenParameterSpec
import java.security.spec.ECParameterSpec
import java.security.spec.ECPoint
import java.security.spec.ECPrivateKeySpec
import java.security.spec.ECPublicKeySpec
import java.util.Base64
import java.util.UUID
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonPrimitive

/**
 * OAuth2 Client Assertion options.
 *
 * @property clientId OAuth2 client ID
 * @property secretKey Base64URL-encoded JWK (EC P-256 private key)
 * @property baseUrl API base URL
 */
data class ClientAssertionOptions(
    val clientId: String,
    val secretKey: String,
    val baseUrl: String,
)

/**
 * Token request body options with sensible defaults.
 *
 * @property grantType OAuth2 grant type
 * @property scope requested scope
 * @property resource target resource
 * @property clientAssertionType assertion type URN
 */
data class BodyOptions(
    val grantType: String = "client_credentials",
    val scope: String = "idv.read",
    val resource: String = "https://api.tomopayment.com/v1/idv",
    val clientAssertionType: String =
        "urn:ietf:params:oauth:client-assertion-type:jwt-bearer",
)

/**
 * Prepared token request data (headers + URL-encoded body).
 *
 * @property headers HTTP headers
 * @property body URL-encoded form body
 */
data class TokenRequestData(
    val headers: Map<String, String>,
    val body: String,
)

/** Helper for creating ES256 JWT client assertions (RFC 7523). */
object ClientAssertionHelper {

    private val base64UrlEncoder: Base64.Encoder = Base64.getUrlEncoder().withoutPadding()
    private val base64UrlDecoder: Base64.Decoder = Base64.getUrlDecoder()
    private val json = Json { ignoreUnknownKeys = true }

    /**
     * Creates an ES256-signed JWT client assertion.
     *
     * @param options client ID, Base64URL-encoded JWK secret key, and base URL
     * @return signed JWT string (header.payload.signature)
     */
    fun createClientAssertion(options: ClientAssertionOptions): String {
        val jwk = decodeBase64UrlToJwk(options.secretKey)
        val privateKey = jwkToECPrivateKey(jwk)
        val now = System.currentTimeMillis() / 1000
        val jti = UUID.randomUUID().toString()

        val payload =
            mapOf(
                "iss" to options.clientId,
                "sub" to options.clientId,
                "aud" to "${options.baseUrl}/v1/oauth2/token",
                "iat" to now,
                "exp" to now + 300,
                "jti" to jti,
            )

        return signJwt(privateKey, payload)
    }

    /**
     * Builds a token request with the given client assertion.
     *
     * @param clientAssertion signed JWT string
     * @param options body options (all fields have defaults)
     * @return [TokenRequestData] with headers and URL-encoded body
     */
    fun buildTokenRequest(
        clientAssertion: String,
        options: BodyOptions = BodyOptions(),
    ): TokenRequestData {
        val params =
            listOf(
                "grant_type" to options.grantType,
                "scope" to options.scope,
                "resource" to options.resource,
                "client_assertion_type" to options.clientAssertionType,
                "client_assertion" to clientAssertion,
            )
        val body =
            params.joinToString("&") { (k, v) ->
                "${URLEncoder.encode(k, "UTF-8")}=${URLEncoder.encode(v, "UTF-8")}"
            }
        val headers = mapOf("Content-Type" to "application/x-www-form-urlencoded")
        return TokenRequestData(headers = headers, body = body)
    }

    // ── Internal helpers ──

    internal fun decodeBase64UrlToJwk(encoded: String): JsonObject {
        val decoded = base64UrlDecoder.decode(encoded)
        return json.parseToJsonElement(String(decoded, Charsets.UTF_8)) as JsonObject
    }

    internal fun jwkToECPrivateKey(jwk: JsonObject): ECPrivateKey {
        val d = BigInteger(1, base64UrlDecoder.decode(jwk["d"]!!.jsonPrimitive.content))

        val params = AlgorithmParameters.getInstance("EC")
        params.init(ECGenParameterSpec("secp256r1"))
        val ecSpec = params.getParameterSpec(ECParameterSpec::class.java)

        val privateKeySpec = ECPrivateKeySpec(d, ecSpec)
        val keyFactory = KeyFactory.getInstance("EC")
        return keyFactory.generatePrivate(privateKeySpec) as ECPrivateKey
    }

    internal fun signJwt(privateKey: ECPrivateKey, payload: Map<String, Any>): String {
        val headerJson = """{"alg":"ES256","typ":"JWT"}"""
        val payloadJson = buildPayloadJson(payload)

        val headerB64 = base64UrlEncoder.encodeToString(headerJson.toByteArray(Charsets.UTF_8))
        val payloadB64 = base64UrlEncoder.encodeToString(payloadJson.toByteArray(Charsets.UTF_8))
        val signingInput = "$headerB64.$payloadB64"

        val signer = Signature.getInstance("SHA256withECDSAinP1363Format")
        signer.initSign(privateKey)
        signer.update(signingInput.toByteArray(Charsets.UTF_8))
        val signatureBytes = signer.sign()

        val signatureB64 = base64UrlEncoder.encodeToString(signatureBytes)
        return "$signingInput.$signatureB64"
    }

    private fun buildPayloadJson(payload: Map<String, Any>): String {
        val entries =
            payload.entries.joinToString(",") { (k, v) ->
                when (v) {
                    is String -> "\"$k\":\"${escapeJsonString(v)}\""
                    is Number -> "\"$k\":$v"
                    else -> "\"$k\":\"${escapeJsonString(v.toString())}\""
                }
            }
        return "{$entries}"
    }

    private fun escapeJsonString(s: String): String =
        s.replace("\\", "\\\\")
            .replace("\"", "\\\"")
            .replace("\n", "\\n")
            .replace("\r", "\\r")
            .replace("\t", "\\t")

    /**
     * Reconstructs an EC public key from a JWK. Useful for signature verification in tests.
     *
     * @param jwk JSON Web Key object containing x and y coordinates
     * @return EC public key
     */
    internal fun jwkToECPublicKey(jwk: JsonObject): java.security.interfaces.ECPublicKey {
        val x = BigInteger(1, base64UrlDecoder.decode(jwk["x"]!!.jsonPrimitive.content))
        val y = BigInteger(1, base64UrlDecoder.decode(jwk["y"]!!.jsonPrimitive.content))

        val params = AlgorithmParameters.getInstance("EC")
        params.init(ECGenParameterSpec("secp256r1"))
        val ecSpec = params.getParameterSpec(ECParameterSpec::class.java)

        val point = ECPoint(x, y)
        val publicKeySpec = ECPublicKeySpec(point, ecSpec)
        val keyFactory = KeyFactory.getInstance("EC")
        return keyFactory.generatePublic(publicKeySpec) as java.security.interfaces.ECPublicKey
    }
}
