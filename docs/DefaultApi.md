# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1IdvCaCookieStartPost**](DefaultApi.md#v1IdvCaCookieStartPost) | **POST** /v1/idv/ca/cookie/start |  |
| [**v1IdvCaHealthGet**](DefaultApi.md#v1IdvCaHealthGet) | **GET** /v1/idv/ca/health |  |
| [**v1IdvCaKycGetPost**](DefaultApi.md#v1IdvCaKycGetPost) | **POST** /v1/idv/ca/kyc/get |  |
| [**v1IdvCaKycPutPost**](DefaultApi.md#v1IdvCaKycPutPost) | **POST** /v1/idv/ca/kyc/put |  |
| [**v1IdvCaStartPost**](DefaultApi.md#v1IdvCaStartPost) | **POST** /v1/idv/ca/start |  |
| [**v1IdvCnHealthGet**](DefaultApi.md#v1IdvCnHealthGet) | **GET** /v1/idv/cn/health |  |
| [**v1IdvCnKycGetPost**](DefaultApi.md#v1IdvCnKycGetPost) | **POST** /v1/idv/cn/kyc/get |  |
| [**v1IdvCnMockKycGetPost**](DefaultApi.md#v1IdvCnMockKycGetPost) | **POST** /v1/idv/cn/mock/kyc/get |  |
| [**v1IdvCnMockStartPost**](DefaultApi.md#v1IdvCnMockStartPost) | **POST** /v1/idv/cn/mock/start |  |
| [**v1IdvCnMockTokenPost**](DefaultApi.md#v1IdvCnMockTokenPost) | **POST** /v1/idv/cn/mock/token |  |
| [**v1IdvCnResultWebPost**](DefaultApi.md#v1IdvCnResultWebPost) | **POST** /v1/idv/cn/result/web |  |
| [**v1IdvCnStartPost**](DefaultApi.md#v1IdvCnStartPost) | **POST** /v1/idv/cn/start |  |
| [**v1IdvCnTokenPost**](DefaultApi.md#v1IdvCnTokenPost) | **POST** /v1/idv/cn/token |  |
| [**v1IdvGoogleCallbackGet**](DefaultApi.md#v1IdvGoogleCallbackGet) | **GET** /v1/idv/google/callback |  |
| [**v1IdvGoogleStartPost**](DefaultApi.md#v1IdvGoogleStartPost) | **POST** /v1/idv/google/start |  |
| [**v1IdvJpCookieStartPost**](DefaultApi.md#v1IdvJpCookieStartPost) | **POST** /v1/idv/jp/cookie/start |  |
| [**v1IdvJpHealthGet**](DefaultApi.md#v1IdvJpHealthGet) | **GET** /v1/idv/jp/health |  |
| [**v1IdvJpKycGetPost**](DefaultApi.md#v1IdvJpKycGetPost) | **POST** /v1/idv/jp/kyc/get |  |
| [**v1IdvJpKycPutPost**](DefaultApi.md#v1IdvJpKycPutPost) | **POST** /v1/idv/jp/kyc/put |  |
| [**v1IdvJpNotificationPost**](DefaultApi.md#v1IdvJpNotificationPost) | **POST** /v1/idv/jp/notification |  |
| [**v1IdvJpStartPost**](DefaultApi.md#v1IdvJpStartPost) | **POST** /v1/idv/jp/start |  |
| [**v1IdvKycGetPost**](DefaultApi.md#v1IdvKycGetPost) | **POST** /v1/idv/kyc/get |  |
| [**v1IdvLiquidTokenSessionPost**](DefaultApi.md#v1IdvLiquidTokenSessionPost) | **POST** /v1/idv/liquid/token/session |  |
| [**v1IdvLoginTicketPost**](DefaultApi.md#v1IdvLoginTicketPost) | **POST** /v1/idv/login-ticket |  |
| [**v1IdvPlaidTokenSessionPost**](DefaultApi.md#v1IdvPlaidTokenSessionPost) | **POST** /v1/idv/plaid/token/session |  |
| [**v1IdvStartPost**](DefaultApi.md#v1IdvStartPost) | **POST** /v1/idv/start |  |
| [**v1IdvUkCookieStartPost**](DefaultApi.md#v1IdvUkCookieStartPost) | **POST** /v1/idv/uk/cookie/start |  |
| [**v1IdvUkHealthGet**](DefaultApi.md#v1IdvUkHealthGet) | **GET** /v1/idv/uk/health |  |
| [**v1IdvUkKycGetPost**](DefaultApi.md#v1IdvUkKycGetPost) | **POST** /v1/idv/uk/kyc/get |  |
| [**v1IdvUkKycPutPost**](DefaultApi.md#v1IdvUkKycPutPost) | **POST** /v1/idv/uk/kyc/put |  |
| [**v1IdvUkStartPost**](DefaultApi.md#v1IdvUkStartPost) | **POST** /v1/idv/uk/start |  |
| [**v1IdvUsCookieStartPost**](DefaultApi.md#v1IdvUsCookieStartPost) | **POST** /v1/idv/us/cookie/start |  |
| [**v1IdvUsHealthGet**](DefaultApi.md#v1IdvUsHealthGet) | **GET** /v1/idv/us/health |  |
| [**v1IdvUsKycGetPost**](DefaultApi.md#v1IdvUsKycGetPost) | **POST** /v1/idv/us/kyc/get |  |
| [**v1IdvUsKycPutPost**](DefaultApi.md#v1IdvUsKycPutPost) | **POST** /v1/idv/us/kyc/put |  |
| [**v1IdvUsStartPost**](DefaultApi.md#v1IdvUsStartPost) | **POST** /v1/idv/us/start |  |
| [**v1Oauth2TokenPost**](DefaultApi.md#v1Oauth2TokenPost) | **POST** /v1/oauth2/token |  |


<a id="v1IdvCaCookieStartPost"></a>
# **v1IdvCaCookieStartPost**
> PlaidStartIdvResp v1IdvCaCookieStartPost(plaidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val plaidStartIdvRequest : PlaidStartIdvRequest =  // PlaidStartIdvRequest | 
try {
    val result : PlaidStartIdvResp = apiInstance.v1IdvCaCookieStartPost(plaidStartIdvRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCaCookieStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCaCookieStartPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidStartIdvRequest** | [**PlaidStartIdvRequest**](PlaidStartIdvRequest.md)|  | [optional] |

### Return type

[**PlaidStartIdvResp**](PlaidStartIdvResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCaHealthGet"></a>
# **v1IdvCaHealthGet**
> kotlin.String v1IdvCaHealthGet()



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.String = apiInstance.v1IdvCaHealthGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCaHealthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCaHealthGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCaKycGetPost"></a>
# **v1IdvCaKycGetPost**
> kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt; v1IdvCaKycGetPost(authorization, plaidGetKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val plaidGetKycReq : PlaidGetKycReq =  // PlaidGetKycReq | 
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.String> = apiInstance.v1IdvCaKycGetPost(authorization, plaidGetKycReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCaKycGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCaKycGetPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidGetKycReq** | [**PlaidGetKycReq**](PlaidGetKycReq.md)|  | [optional] |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCaKycPutPost"></a>
# **v1IdvCaKycPutPost**
> v1IdvCaKycPutPost(plaidPutKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val plaidPutKycReq : PlaidPutKycReq =  // PlaidPutKycReq | 
try {
    apiInstance.v1IdvCaKycPutPost(plaidPutKycReq)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCaKycPutPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCaKycPutPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidPutKycReq** | [**PlaidPutKycReq**](PlaidPutKycReq.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCaStartPost"></a>
# **v1IdvCaStartPost**
> PlaidStartIdvResp v1IdvCaStartPost(authorization, plaidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val plaidStartIdvRequest : PlaidStartIdvRequest =  // PlaidStartIdvRequest | 
try {
    val result : PlaidStartIdvResp = apiInstance.v1IdvCaStartPost(authorization, plaidStartIdvRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCaStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCaStartPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidStartIdvRequest** | [**PlaidStartIdvRequest**](PlaidStartIdvRequest.md)|  | [optional] |

### Return type

[**PlaidStartIdvResp**](PlaidStartIdvResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnHealthGet"></a>
# **v1IdvCnHealthGet**
> kotlin.String v1IdvCnHealthGet()



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.String = apiInstance.v1IdvCnHealthGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCnHealthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCnHealthGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnKycGetPost"></a>
# **v1IdvCnKycGetPost**
> kotlin.Any v1IdvCnKycGetPost(authorization, tomoIdvGetResultReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val tomoIdvGetResultReq : TomoIdvGetResultReq =  // TomoIdvGetResultReq | 
try {
    val result : kotlin.Any = apiInstance.v1IdvCnKycGetPost(authorization, tomoIdvGetResultReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCnKycGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCnKycGetPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tomoIdvGetResultReq** | [**TomoIdvGetResultReq**](TomoIdvGetResultReq.md)|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnMockKycGetPost"></a>
# **v1IdvCnMockKycGetPost**
> kotlin.Any v1IdvCnMockKycGetPost(authorization, tomoIdvMockGetResultReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val tomoIdvMockGetResultReq : TomoIdvMockGetResultReq =  // TomoIdvMockGetResultReq | 
try {
    val result : kotlin.Any = apiInstance.v1IdvCnMockKycGetPost(authorization, tomoIdvMockGetResultReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCnMockKycGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCnMockKycGetPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tomoIdvMockGetResultReq** | [**TomoIdvMockGetResultReq**](TomoIdvMockGetResultReq.md)|  | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnMockStartPost"></a>
# **v1IdvCnMockStartPost**
> TomoIdvMockStartRes v1IdvCnMockStartPost(authorization, tomoIdvMockStartReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val tomoIdvMockStartReq : TomoIdvMockStartReq =  // TomoIdvMockStartReq | 
try {
    val result : TomoIdvMockStartRes = apiInstance.v1IdvCnMockStartPost(authorization, tomoIdvMockStartReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCnMockStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCnMockStartPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tomoIdvMockStartReq** | [**TomoIdvMockStartReq**](TomoIdvMockStartReq.md)|  | [optional] |

### Return type

[**TomoIdvMockStartRes**](TomoIdvMockStartRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnMockTokenPost"></a>
# **v1IdvCnMockTokenPost**
> TomoIdvMockIssueTokenRes v1IdvCnMockTokenPost(authorization, tomoIdvMockIssueTokenReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val tomoIdvMockIssueTokenReq : TomoIdvMockIssueTokenReq =  // TomoIdvMockIssueTokenReq | 
try {
    val result : TomoIdvMockIssueTokenRes = apiInstance.v1IdvCnMockTokenPost(authorization, tomoIdvMockIssueTokenReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCnMockTokenPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCnMockTokenPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tomoIdvMockIssueTokenReq** | [**TomoIdvMockIssueTokenReq**](TomoIdvMockIssueTokenReq.md)|  | [optional] |

### Return type

[**TomoIdvMockIssueTokenRes**](TomoIdvMockIssueTokenRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnResultWebPost"></a>
# **v1IdvCnResultWebPost**
> kotlin.Any v1IdvCnResultWebPost()



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.Any = apiInstance.v1IdvCnResultWebPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCnResultWebPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCnResultWebPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnStartPost"></a>
# **v1IdvCnStartPost**
> TomoIdvStartRes v1IdvCnStartPost(authorization, tomoIdvStartReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val tomoIdvStartReq : TomoIdvStartReq =  // TomoIdvStartReq | 
try {
    val result : TomoIdvStartRes = apiInstance.v1IdvCnStartPost(authorization, tomoIdvStartReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCnStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCnStartPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tomoIdvStartReq** | [**TomoIdvStartReq**](TomoIdvStartReq.md)|  | [optional] |

### Return type

[**TomoIdvStartRes**](TomoIdvStartRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnTokenPost"></a>
# **v1IdvCnTokenPost**
> TomoIdvIssueTokenRes v1IdvCnTokenPost(authorization, tomoIdvIssueTokenReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val tomoIdvIssueTokenReq : TomoIdvIssueTokenReq =  // TomoIdvIssueTokenReq | 
try {
    val result : TomoIdvIssueTokenRes = apiInstance.v1IdvCnTokenPost(authorization, tomoIdvIssueTokenReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCnTokenPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCnTokenPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tomoIdvIssueTokenReq** | [**TomoIdvIssueTokenReq**](TomoIdvIssueTokenReq.md)|  | [optional] |

### Return type

[**TomoIdvIssueTokenRes**](TomoIdvIssueTokenRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvGoogleCallbackGet"></a>
# **v1IdvGoogleCallbackGet**
> v1IdvGoogleCallbackGet(code, state, error)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val code : kotlin.String = code_example // kotlin.String | 
val state : kotlin.String = state_example // kotlin.String | 
val error : kotlin.String = error_example // kotlin.String | 
try {
    apiInstance.v1IdvGoogleCallbackGet(code, state, error)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvGoogleCallbackGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvGoogleCallbackGet")
    e.printStackTrace()
}
```

### Parameters
| **code** | **kotlin.String**|  | [optional] |
| **state** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **error** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvGoogleStartPost"></a>
# **v1IdvGoogleStartPost**
> GoogleStartResp v1IdvGoogleStartPost(authorization, googleStartReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val googleStartReq : GoogleStartReq =  // GoogleStartReq | 
try {
    val result : GoogleStartResp = apiInstance.v1IdvGoogleStartPost(authorization, googleStartReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvGoogleStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvGoogleStartPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **googleStartReq** | [**GoogleStartReq**](GoogleStartReq.md)|  | [optional] |

### Return type

[**GoogleStartResp**](GoogleStartResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvJpCookieStartPost"></a>
# **v1IdvJpCookieStartPost**
> LiquidIntegratedAppResponse v1IdvJpCookieStartPost(liquidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val liquidStartIdvRequest : LiquidStartIdvRequest =  // LiquidStartIdvRequest | 
try {
    val result : LiquidIntegratedAppResponse = apiInstance.v1IdvJpCookieStartPost(liquidStartIdvRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvJpCookieStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvJpCookieStartPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **liquidStartIdvRequest** | [**LiquidStartIdvRequest**](LiquidStartIdvRequest.md)|  | [optional] |

### Return type

[**LiquidIntegratedAppResponse**](LiquidIntegratedAppResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvJpHealthGet"></a>
# **v1IdvJpHealthGet**
> kotlin.String v1IdvJpHealthGet()



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.String = apiInstance.v1IdvJpHealthGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvJpHealthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvJpHealthGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvJpKycGetPost"></a>
# **v1IdvJpKycGetPost**
> kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt; v1IdvJpKycGetPost(authorization, liquidGetKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val liquidGetKycReq : LiquidGetKycReq =  // LiquidGetKycReq | 
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.String> = apiInstance.v1IdvJpKycGetPost(authorization, liquidGetKycReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvJpKycGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvJpKycGetPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **liquidGetKycReq** | [**LiquidGetKycReq**](LiquidGetKycReq.md)|  | [optional] |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvJpKycPutPost"></a>
# **v1IdvJpKycPutPost**
> v1IdvJpKycPutPost(liquidPutKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val liquidPutKycReq : LiquidPutKycReq =  // LiquidPutKycReq | 
try {
    apiInstance.v1IdvJpKycPutPost(liquidPutKycReq)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvJpKycPutPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvJpKycPutPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **liquidPutKycReq** | [**LiquidPutKycReq**](LiquidPutKycReq.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvJpNotificationPost"></a>
# **v1IdvJpNotificationPost**
> EitherStringValue v1IdvJpNotificationPost(body)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val body : kotlin.Any =  // kotlin.Any | 
try {
    val result : EitherStringValue = apiInstance.v1IdvJpNotificationPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvJpNotificationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvJpNotificationPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**EitherStringValue**](EitherStringValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvJpStartPost"></a>
# **v1IdvJpStartPost**
> LiquidIntegratedAppResponse v1IdvJpStartPost(authorization, liquidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val liquidStartIdvRequest : LiquidStartIdvRequest =  // LiquidStartIdvRequest | 
try {
    val result : LiquidIntegratedAppResponse = apiInstance.v1IdvJpStartPost(authorization, liquidStartIdvRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvJpStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvJpStartPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **liquidStartIdvRequest** | [**LiquidStartIdvRequest**](LiquidStartIdvRequest.md)|  | [optional] |

### Return type

[**LiquidIntegratedAppResponse**](LiquidIntegratedAppResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvKycGetPost"></a>
# **v1IdvKycGetPost**
> GetKycResp v1IdvKycGetPost(authorization, getKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val getKycReq : GetKycReq =  // GetKycReq | 
try {
    val result : GetKycResp = apiInstance.v1IdvKycGetPost(authorization, getKycReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvKycGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvKycGetPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getKycReq** | [**GetKycReq**](GetKycReq.md)|  | [optional] |

### Return type

[**GetKycResp**](GetKycResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvLiquidTokenSessionPost"></a>
# **v1IdvLiquidTokenSessionPost**
> SessionToken v1IdvLiquidTokenSessionPost(liquidSessionTokenRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val liquidSessionTokenRequest : LiquidSessionTokenRequest =  // LiquidSessionTokenRequest | 
try {
    val result : SessionToken = apiInstance.v1IdvLiquidTokenSessionPost(liquidSessionTokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvLiquidTokenSessionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvLiquidTokenSessionPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **liquidSessionTokenRequest** | [**LiquidSessionTokenRequest**](LiquidSessionTokenRequest.md)|  | [optional] |

### Return type

[**SessionToken**](SessionToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvLoginTicketPost"></a>
# **v1IdvLoginTicketPost**
> LoginTicketResponse v1IdvLoginTicketPost(loginTicketRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val loginTicketRequest : LoginTicketRequest =  // LoginTicketRequest | 
try {
    val result : LoginTicketResponse = apiInstance.v1IdvLoginTicketPost(loginTicketRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvLoginTicketPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvLoginTicketPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loginTicketRequest** | [**LoginTicketRequest**](LoginTicketRequest.md)|  | [optional] |

### Return type

[**LoginTicketResponse**](LoginTicketResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvPlaidTokenSessionPost"></a>
# **v1IdvPlaidTokenSessionPost**
> SessionToken v1IdvPlaidTokenSessionPost(plaidSessionTokenRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val plaidSessionTokenRequest : PlaidSessionTokenRequest =  // PlaidSessionTokenRequest | 
try {
    val result : SessionToken = apiInstance.v1IdvPlaidTokenSessionPost(plaidSessionTokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvPlaidTokenSessionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvPlaidTokenSessionPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidSessionTokenRequest** | [**PlaidSessionTokenRequest**](PlaidSessionTokenRequest.md)|  | [optional] |

### Return type

[**SessionToken**](SessionToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvStartPost"></a>
# **v1IdvStartPost**
> StartIdvResp v1IdvStartPost(authorization, startIdvReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val startIdvReq : StartIdvReq =  // StartIdvReq | 
try {
    val result : StartIdvResp = apiInstance.v1IdvStartPost(authorization, startIdvReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvStartPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIdvReq** | [**StartIdvReq**](StartIdvReq.md)|  | [optional] |

### Return type

[**StartIdvResp**](StartIdvResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUkCookieStartPost"></a>
# **v1IdvUkCookieStartPost**
> PlaidStartIdvResp v1IdvUkCookieStartPost(plaidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val plaidStartIdvRequest : PlaidStartIdvRequest =  // PlaidStartIdvRequest | 
try {
    val result : PlaidStartIdvResp = apiInstance.v1IdvUkCookieStartPost(plaidStartIdvRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvUkCookieStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvUkCookieStartPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidStartIdvRequest** | [**PlaidStartIdvRequest**](PlaidStartIdvRequest.md)|  | [optional] |

### Return type

[**PlaidStartIdvResp**](PlaidStartIdvResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUkHealthGet"></a>
# **v1IdvUkHealthGet**
> kotlin.String v1IdvUkHealthGet()



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.String = apiInstance.v1IdvUkHealthGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvUkHealthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvUkHealthGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUkKycGetPost"></a>
# **v1IdvUkKycGetPost**
> kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt; v1IdvUkKycGetPost(authorization, plaidGetKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val plaidGetKycReq : PlaidGetKycReq =  // PlaidGetKycReq | 
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.String> = apiInstance.v1IdvUkKycGetPost(authorization, plaidGetKycReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvUkKycGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvUkKycGetPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidGetKycReq** | [**PlaidGetKycReq**](PlaidGetKycReq.md)|  | [optional] |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUkKycPutPost"></a>
# **v1IdvUkKycPutPost**
> v1IdvUkKycPutPost(plaidPutKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val plaidPutKycReq : PlaidPutKycReq =  // PlaidPutKycReq | 
try {
    apiInstance.v1IdvUkKycPutPost(plaidPutKycReq)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvUkKycPutPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvUkKycPutPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidPutKycReq** | [**PlaidPutKycReq**](PlaidPutKycReq.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUkStartPost"></a>
# **v1IdvUkStartPost**
> PlaidStartIdvResp v1IdvUkStartPost(authorization, plaidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val plaidStartIdvRequest : PlaidStartIdvRequest =  // PlaidStartIdvRequest | 
try {
    val result : PlaidStartIdvResp = apiInstance.v1IdvUkStartPost(authorization, plaidStartIdvRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvUkStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvUkStartPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidStartIdvRequest** | [**PlaidStartIdvRequest**](PlaidStartIdvRequest.md)|  | [optional] |

### Return type

[**PlaidStartIdvResp**](PlaidStartIdvResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUsCookieStartPost"></a>
# **v1IdvUsCookieStartPost**
> PlaidStartIdvResp v1IdvUsCookieStartPost(plaidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val plaidStartIdvRequest : PlaidStartIdvRequest =  // PlaidStartIdvRequest | 
try {
    val result : PlaidStartIdvResp = apiInstance.v1IdvUsCookieStartPost(plaidStartIdvRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvUsCookieStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvUsCookieStartPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidStartIdvRequest** | [**PlaidStartIdvRequest**](PlaidStartIdvRequest.md)|  | [optional] |

### Return type

[**PlaidStartIdvResp**](PlaidStartIdvResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUsHealthGet"></a>
# **v1IdvUsHealthGet**
> kotlin.String v1IdvUsHealthGet()



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.String = apiInstance.v1IdvUsHealthGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvUsHealthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvUsHealthGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUsKycGetPost"></a>
# **v1IdvUsKycGetPost**
> kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt; v1IdvUsKycGetPost(authorization, plaidGetKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val plaidGetKycReq : PlaidGetKycReq =  // PlaidGetKycReq | 
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.String> = apiInstance.v1IdvUsKycGetPost(authorization, plaidGetKycReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvUsKycGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvUsKycGetPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidGetKycReq** | [**PlaidGetKycReq**](PlaidGetKycReq.md)|  | [optional] |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUsKycPutPost"></a>
# **v1IdvUsKycPutPost**
> v1IdvUsKycPutPost(plaidPutKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val plaidPutKycReq : PlaidPutKycReq =  // PlaidPutKycReq | 
try {
    apiInstance.v1IdvUsKycPutPost(plaidPutKycReq)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvUsKycPutPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvUsKycPutPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidPutKycReq** | [**PlaidPutKycReq**](PlaidPutKycReq.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUsStartPost"></a>
# **v1IdvUsStartPost**
> PlaidStartIdvResp v1IdvUsStartPost(authorization, plaidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val plaidStartIdvRequest : PlaidStartIdvRequest =  // PlaidStartIdvRequest | 
try {
    val result : PlaidStartIdvResp = apiInstance.v1IdvUsStartPost(authorization, plaidStartIdvRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvUsStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvUsStartPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **plaidStartIdvRequest** | [**PlaidStartIdvRequest**](PlaidStartIdvRequest.md)|  | [optional] |

### Return type

[**PlaidStartIdvResp**](PlaidStartIdvResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1Oauth2TokenPost"></a>
# **v1Oauth2TokenPost**
> TokenResponse v1Oauth2TokenPost(clientAssertion, clientAssertionType, grantType, resource, scope)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.infrastructure.*
//import com.tomoarrow.idv.client.models.*

val apiInstance = DefaultApi()
val clientAssertion : kotlin.String = clientAssertion_example // kotlin.String | 
val clientAssertionType : kotlin.String = clientAssertionType_example // kotlin.String | 
val grantType : kotlin.String = grantType_example // kotlin.String | 
val resource : kotlin.String = resource_example // kotlin.String | 
val scope : kotlin.String = scope_example // kotlin.String | 
try {
    val result : TokenResponse = apiInstance.v1Oauth2TokenPost(clientAssertion, clientAssertionType, grantType, resource, scope)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1Oauth2TokenPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1Oauth2TokenPost")
    e.printStackTrace()
}
```

### Parameters
| **clientAssertion** | **kotlin.String**|  | |
| **clientAssertionType** | **kotlin.String**|  | |
| **grantType** | **kotlin.String**|  | |
| **resource** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scope** | **kotlin.String**|  | [optional] |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json;charset=utf-8

