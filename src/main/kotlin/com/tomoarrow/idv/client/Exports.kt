@file:Suppress("unused")
package com.tomoarrow.idv.client

// ── API ──
typealias DefaultApi = com.tomoarrow.idv.client.generated.apis.DefaultApi

// ── Infrastructure ──
typealias ApiClient = com.tomoarrow.idv.client.generated.infrastructure.ApiClient
typealias ApiResponse<T> = com.tomoarrow.idv.client.generated.infrastructure.ApiResponse<T>
typealias ClientException = com.tomoarrow.idv.client.generated.infrastructure.ClientException
typealias ServerException = com.tomoarrow.idv.client.generated.infrastructure.ServerException
typealias Serializer = com.tomoarrow.idv.client.generated.infrastructure.Serializer

// ── Models ──
typealias CaStartIdvReq = com.tomoarrow.idv.client.generated.models.CaStartIdvReq
typealias CnStartIdvReq = com.tomoarrow.idv.client.generated.models.CnStartIdvReq
typealias Country = com.tomoarrow.idv.client.generated.models.Country
typealias GetKycReq = com.tomoarrow.idv.client.generated.models.GetKycReq
typealias GetKycRes = com.tomoarrow.idv.client.generated.models.GetKycRes
typealias JpStartIdvReq = com.tomoarrow.idv.client.generated.models.JpStartIdvReq
typealias KycPolicy = com.tomoarrow.idv.client.generated.models.KycPolicy
typealias StartIdvReq = com.tomoarrow.idv.client.generated.models.StartIdvReq
typealias StartIdvRes = com.tomoarrow.idv.client.generated.models.StartIdvRes
typealias TokenRes = com.tomoarrow.idv.client.generated.models.TokenRes
typealias UkStartIdvReq = com.tomoarrow.idv.client.generated.models.UkStartIdvReq
typealias UsStartIdvReq = com.tomoarrow.idv.client.generated.models.UsStartIdvReq

// Backward-compatible names for response schemas that were renamed by the
// narrowed SDK contract. Vendor-specific request/response aliases are omitted
// because those schemas are intentionally no longer part of the SDK surface.
typealias GetKycResp = GetKycRes
typealias StartIdvResp = StartIdvRes
typealias TokenResponse = TokenRes

// ── Client Assertion ──
// ClientAssertionHelper, ClientAssertionOptions, BodyOptions, TokenRequestData는
// com.tomoarrow.idv.client 패키지에 직접 위치하므로 typealias 불필요
