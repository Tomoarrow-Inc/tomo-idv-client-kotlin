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
typealias Country = com.tomoarrow.idv.client.generated.models.Country
typealias GetKycReq = com.tomoarrow.idv.client.generated.models.GetKycReq
typealias GetKycRes = com.tomoarrow.idv.client.generated.models.GetKycRes
typealias LaunchKind = com.tomoarrow.idv.client.generated.models.LaunchKind
typealias LiquidGetKycReq = com.tomoarrow.idv.client.generated.models.LiquidGetKycReq
typealias LiquidGetResultRes = com.tomoarrow.idv.client.generated.models.LiquidGetResultRes
typealias LiquidGetUnionResultRes = com.tomoarrow.idv.client.generated.models.LiquidGetUnionResultRes
typealias LiquidIdvField = com.tomoarrow.idv.client.generated.models.LiquidIdvField
typealias LiquidIntegratedAppRes = com.tomoarrow.idv.client.generated.models.LiquidIntegratedAppRes
typealias LiquidStartIdvReq = com.tomoarrow.idv.client.generated.models.LiquidStartIdvReq
typealias PlaidGetKycReq = com.tomoarrow.idv.client.generated.models.PlaidGetKycReq
typealias PlaidIdvField = com.tomoarrow.idv.client.generated.models.PlaidIdvField
typealias PlaidStartIdvReq = com.tomoarrow.idv.client.generated.models.PlaidStartIdvReq
typealias PlaidStartIdvRes = com.tomoarrow.idv.client.generated.models.PlaidStartIdvRes
typealias SessionStartReq = com.tomoarrow.idv.client.generated.models.SessionStartReq
typealias SessionStartRes = com.tomoarrow.idv.client.generated.models.SessionStartRes
typealias StartIdvReq = com.tomoarrow.idv.client.generated.models.StartIdvReq
typealias StartIdvRes = com.tomoarrow.idv.client.generated.models.StartIdvRes
typealias TencentGetKycReq = com.tomoarrow.idv.client.generated.models.TencentGetKycReq
typealias TencentGetKycRes = com.tomoarrow.idv.client.generated.models.TencentGetKycRes
typealias TencentGetUnionResultRes = com.tomoarrow.idv.client.generated.models.TencentGetUnionResultRes
typealias TencentIdvField = com.tomoarrow.idv.client.generated.models.TencentIdvField
typealias TencentStartIdvRes = com.tomoarrow.idv.client.generated.models.TencentStartIdvRes
typealias TencentStartReq = com.tomoarrow.idv.client.generated.models.TencentStartReq
typealias TokenRes = com.tomoarrow.idv.client.generated.models.TokenRes
typealias TomoIdvIssueTokenReq = com.tomoarrow.idv.client.generated.models.TomoIdvIssueTokenReq
typealias TomoIdvIssueTokenRes = com.tomoarrow.idv.client.generated.models.TomoIdvIssueTokenRes

// ── Client Assertion ──
// ClientAssertionHelper, ClientAssertionOptions, BodyOptions, TokenRequestData는
// com.tomoarrow.idv.client 패키지에 직접 위치하므로 typealias 불필요
