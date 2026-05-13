package com.tomoarrow.idv.client

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class ExportsTest : ShouldSpec() {
    init {
        should("expose the narrowed SDK contract model aliases") {
            // This test protects the manually maintained public alias surface.
            // Contract generation can rename or remove generated model classes,
            // so the SDK build must fail here if Exports.kt drifts again.
            val policy: KycPolicy = KycPolicy(
                method = "personal_info_verf",
                ownerAssurance = mapOf("kind" to "owner_verf", "type" to "sms_otp"),
                subject = mapOf("kind" to "personal_info"),
            )
            val startReq: StartIdvReq = StartIdvReq(
                callbackUrl = "https://idv.example/callback",
                userId = "user-1",
                country = Country.US,
                kycPolicy = policy,
            )
            val startRes: StartIdvRes = StartIdvRes(startIdvUri = "https://idv.example/start")
            val result: GetKycRes = GetKycRes(
                country = "us",
                dateOfBirth = "1990-01-01",
                fullAddress = "1 Main St",
                fullName = "Test User",
            )
            val token: TokenRes = TokenRes(
                accessToken = "access-token",
                expiresIn = 3600,
                tokenType = "Bearer",
            )

            startReq.kycPolicy shouldBe policy
            startRes.startIdvUri shouldBe "https://idv.example/start"
            result.fullName shouldBe "Test User"
            token.tokenType shouldBe "Bearer"
        }

        should("keep response compatibility aliases mapped to current schemas") {
            val startRes: StartIdvResp = StartIdvRes(startIdvUri = "https://idv.example/start")
            val result: GetKycResp = GetKycRes(
                country = "us",
                dateOfBirth = "1990-01-01",
                fullAddress = "1 Main St",
                fullName = "Test User",
            )
            val token: TokenResponse = TokenRes(
                accessToken = "access-token",
                expiresIn = 3600,
                tokenType = "Bearer",
            )

            startRes.startIdvUri shouldBe "https://idv.example/start"
            result.country shouldBe "us"
            token.accessToken shouldBe "access-token"
        }
    }
}
