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
typealias GetKycResp = com.tomoarrow.idv.client.generated.models.GetKycResp
typealias GoogleStartReq = com.tomoarrow.idv.client.generated.models.GoogleStartReq
typealias GoogleStartResp = com.tomoarrow.idv.client.generated.models.GoogleStartResp
typealias LiquidGetKycReq = com.tomoarrow.idv.client.generated.models.LiquidGetKycReq
typealias LiquidIdvField = com.tomoarrow.idv.client.generated.models.LiquidIdvField
typealias LiquidIntegratedAppResponse = com.tomoarrow.idv.client.generated.models.LiquidIntegratedAppResponse
typealias LiquidStartIdvRequest = com.tomoarrow.idv.client.generated.models.LiquidStartIdvRequest
typealias PlaidGetKycReq = com.tomoarrow.idv.client.generated.models.PlaidGetKycReq
typealias PlaidIdvField = com.tomoarrow.idv.client.generated.models.PlaidIdvField
typealias PlaidStartIdvRequest = com.tomoarrow.idv.client.generated.models.PlaidStartIdvRequest
typealias PlaidStartIdvResp = com.tomoarrow.idv.client.generated.models.PlaidStartIdvResp
typealias SocialResultReq = com.tomoarrow.idv.client.generated.models.SocialResultReq
typealias StartIdvReq = com.tomoarrow.idv.client.generated.models.StartIdvReq
typealias StartIdvResp = com.tomoarrow.idv.client.generated.models.StartIdvResp
typealias TencentGetKycReq = com.tomoarrow.idv.client.generated.models.TencentGetKycReq
typealias TencentGetKycResp = com.tomoarrow.idv.client.generated.models.TencentGetKycResp
typealias TencentGetUnionResultResp = com.tomoarrow.idv.client.generated.models.TencentGetUnionResultResp
typealias TencentIdvField = com.tomoarrow.idv.client.generated.models.TencentIdvField
typealias TokenResponse = com.tomoarrow.idv.client.generated.models.TokenResponse
typealias TomoIdvStartReq = com.tomoarrow.idv.client.generated.models.TomoIdvStartReq
typealias TomoIdvStartRes = com.tomoarrow.idv.client.generated.models.TomoIdvStartRes
typealias WeChatStartReq = com.tomoarrow.idv.client.generated.models.WeChatStartReq
typealias WeChatStartResp = com.tomoarrow.idv.client.generated.models.WeChatStartResp
