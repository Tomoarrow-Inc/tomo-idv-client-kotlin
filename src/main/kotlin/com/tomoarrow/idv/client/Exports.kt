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
typealias EitherStringValue = com.tomoarrow.idv.client.generated.models.EitherStringValue
typealias EitherStringValueOneOf = com.tomoarrow.idv.client.generated.models.EitherStringValueOneOf
typealias EitherStringValueOneOf1 = com.tomoarrow.idv.client.generated.models.EitherStringValueOneOf1
typealias GetKycReq = com.tomoarrow.idv.client.generated.models.GetKycReq
typealias GetKycResp = com.tomoarrow.idv.client.generated.models.GetKycResp
typealias GoogleStartReq = com.tomoarrow.idv.client.generated.models.GoogleStartReq
typealias GoogleStartResp = com.tomoarrow.idv.client.generated.models.GoogleStartResp
typealias LiquidGetKycReq = com.tomoarrow.idv.client.generated.models.LiquidGetKycReq
typealias LiquidIdvField = com.tomoarrow.idv.client.generated.models.LiquidIdvField
typealias LiquidIntegratedAppResponse = com.tomoarrow.idv.client.generated.models.LiquidIntegratedAppResponse
typealias LiquidPutKycReq = com.tomoarrow.idv.client.generated.models.LiquidPutKycReq
typealias LiquidSessionTokenRequest = com.tomoarrow.idv.client.generated.models.LiquidSessionTokenRequest
typealias LiquidStartIdvRequest = com.tomoarrow.idv.client.generated.models.LiquidStartIdvRequest
typealias LoginTicketRequest = com.tomoarrow.idv.client.generated.models.LoginTicketRequest
typealias LoginTicketResponse = com.tomoarrow.idv.client.generated.models.LoginTicketResponse
typealias PlaidGetKycReq = com.tomoarrow.idv.client.generated.models.PlaidGetKycReq
typealias PlaidIdvField = com.tomoarrow.idv.client.generated.models.PlaidIdvField
typealias PlaidPutKycReq = com.tomoarrow.idv.client.generated.models.PlaidPutKycReq
typealias PlaidSessionTokenRequest = com.tomoarrow.idv.client.generated.models.PlaidSessionTokenRequest
typealias PlaidStartIdvRequest = com.tomoarrow.idv.client.generated.models.PlaidStartIdvRequest
typealias PlaidStartIdvResp = com.tomoarrow.idv.client.generated.models.PlaidStartIdvResp
typealias SessionToken = com.tomoarrow.idv.client.generated.models.SessionToken
typealias StartIdvReq = com.tomoarrow.idv.client.generated.models.StartIdvReq
typealias StartIdvResp = com.tomoarrow.idv.client.generated.models.StartIdvResp
typealias TokenResponse = com.tomoarrow.idv.client.generated.models.TokenResponse
typealias TomoIdvGetResultReq = com.tomoarrow.idv.client.generated.models.TomoIdvGetResultReq
typealias TomoIdvIssueTokenReq = com.tomoarrow.idv.client.generated.models.TomoIdvIssueTokenReq
typealias TomoIdvIssueTokenRes = com.tomoarrow.idv.client.generated.models.TomoIdvIssueTokenRes
typealias TomoIdvMockGetResultReq = com.tomoarrow.idv.client.generated.models.TomoIdvMockGetResultReq
typealias TomoIdvMockIssueTokenReq = com.tomoarrow.idv.client.generated.models.TomoIdvMockIssueTokenReq
typealias TomoIdvMockIssueTokenRes = com.tomoarrow.idv.client.generated.models.TomoIdvMockIssueTokenRes
typealias TomoIdvMockStartReq = com.tomoarrow.idv.client.generated.models.TomoIdvMockStartReq
typealias TomoIdvMockStartRes = com.tomoarrow.idv.client.generated.models.TomoIdvMockStartRes
typealias TomoIdvStartReq = com.tomoarrow.idv.client.generated.models.TomoIdvStartReq
typealias TomoIdvStartRes = com.tomoarrow.idv.client.generated.models.TomoIdvStartRes
