# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1IdvCaHealthGet**](DefaultApi.md#v1IdvCaHealthGet) | **GET** /v1/idv/ca/health |  |
| [**v1IdvCaKycGetPost**](DefaultApi.md#v1IdvCaKycGetPost) | **POST** /v1/idv/ca/kyc/get |  |
| [**v1IdvCaStartPost**](DefaultApi.md#v1IdvCaStartPost) | **POST** /v1/idv/ca/start |  |
| [**v1IdvCnCookieStartPost**](DefaultApi.md#v1IdvCnCookieStartPost) | **POST** /v1/idv/cn/cookie/start |  |
| [**v1IdvCnHealthGet**](DefaultApi.md#v1IdvCnHealthGet) | **GET** /v1/idv/cn/health |  |
| [**v1IdvCnKycGetPost**](DefaultApi.md#v1IdvCnKycGetPost) | **POST** /v1/idv/cn/kyc/get |  |
| [**v1IdvCnResultWebPost**](DefaultApi.md#v1IdvCnResultWebPost) | **POST** /v1/idv/cn/result/web |  |
| [**v1IdvCnStartPost**](DefaultApi.md#v1IdvCnStartPost) | **POST** /v1/idv/cn/start |  |
| [**v1IdvCnTokenPost**](DefaultApi.md#v1IdvCnTokenPost) | **POST** /v1/idv/cn/token |  |
| [**v1IdvJpHealthGet**](DefaultApi.md#v1IdvJpHealthGet) | **GET** /v1/idv/jp/health |  |
| [**v1IdvJpKycGetPost**](DefaultApi.md#v1IdvJpKycGetPost) | **POST** /v1/idv/jp/kyc/get |  |
| [**v1IdvJpStartPost**](DefaultApi.md#v1IdvJpStartPost) | **POST** /v1/idv/jp/start |  |
| [**v1IdvKycGetPost**](DefaultApi.md#v1IdvKycGetPost) | **POST** /v1/idv/kyc/get |  |
| [**v1IdvSessionsStartPost**](DefaultApi.md#v1IdvSessionsStartPost) | **POST** /v1/idv/sessions/start |  |
| [**v1IdvStartPost**](DefaultApi.md#v1IdvStartPost) | **POST** /v1/idv/start |  |
| [**v1IdvUkHealthGet**](DefaultApi.md#v1IdvUkHealthGet) | **GET** /v1/idv/uk/health |  |
| [**v1IdvUkKycGetPost**](DefaultApi.md#v1IdvUkKycGetPost) | **POST** /v1/idv/uk/kyc/get |  |
| [**v1IdvUkStartPost**](DefaultApi.md#v1IdvUkStartPost) | **POST** /v1/idv/uk/start |  |
| [**v1IdvUsHealthGet**](DefaultApi.md#v1IdvUsHealthGet) | **GET** /v1/idv/us/health |  |
| [**v1IdvUsKycGetPost**](DefaultApi.md#v1IdvUsKycGetPost) | **POST** /v1/idv/us/kyc/get |  |
| [**v1IdvUsStartPost**](DefaultApi.md#v1IdvUsStartPost) | **POST** /v1/idv/us/start |  |
| [**v1Oauth2TokenPost**](DefaultApi.md#v1Oauth2TokenPost) | **POST** /v1/oauth2/token |  |


<a id="v1IdvCaHealthGet"></a>
# **v1IdvCaHealthGet**
> kotlin.String v1IdvCaHealthGet()



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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

<a id="v1IdvCaStartPost"></a>
# **v1IdvCaStartPost**
> PlaidStartIdvRes v1IdvCaStartPost(authorization, plaidStartIdvReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val plaidStartIdvReq : PlaidStartIdvReq =  // PlaidStartIdvReq | 
try {
    val result : PlaidStartIdvRes = apiInstance.v1IdvCaStartPost(authorization, plaidStartIdvReq)
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
| **plaidStartIdvReq** | [**PlaidStartIdvReq**](PlaidStartIdvReq.md)|  | [optional] |

### Return type

[**PlaidStartIdvRes**](PlaidStartIdvRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnCookieStartPost"></a>
# **v1IdvCnCookieStartPost**
> TencentStartIdvRes v1IdvCnCookieStartPost(tencentStartReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val tencentStartReq : TencentStartReq =  // TencentStartReq | 
try {
    val result : TencentStartIdvRes = apiInstance.v1IdvCnCookieStartPost(tencentStartReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvCnCookieStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvCnCookieStartPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tencentStartReq** | [**TencentStartReq**](TencentStartReq.md)|  | [optional] |

### Return type

[**TencentStartIdvRes**](TencentStartIdvRes.md)

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
> TencentGetUnionResultRes v1IdvCnKycGetPost(authorization, tencentGetKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val tencentGetKycReq : TencentGetKycReq =  // TencentGetKycReq | 
try {
    val result : TencentGetUnionResultRes = apiInstance.v1IdvCnKycGetPost(authorization, tencentGetKycReq)
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
| **tencentGetKycReq** | [**TencentGetKycReq**](TencentGetKycReq.md)|  | [optional] |

### Return type

[**TencentGetUnionResultRes**](TencentGetUnionResultRes.md)

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
> TencentStartIdvRes v1IdvCnStartPost(authorization, tencentStartReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val tencentStartReq : TencentStartReq =  // TencentStartReq | 
try {
    val result : TencentStartIdvRes = apiInstance.v1IdvCnStartPost(authorization, tencentStartReq)
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
| **tencentStartReq** | [**TencentStartReq**](TencentStartReq.md)|  | [optional] |

### Return type

[**TencentStartIdvRes**](TencentStartIdvRes.md)

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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

<a id="v1IdvJpHealthGet"></a>
# **v1IdvJpHealthGet**
> kotlin.String v1IdvJpHealthGet()



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
> LiquidGetUnionResultRes v1IdvJpKycGetPost(authorization, liquidGetKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val liquidGetKycReq : LiquidGetKycReq =  // LiquidGetKycReq | 
try {
    val result : LiquidGetUnionResultRes = apiInstance.v1IdvJpKycGetPost(authorization, liquidGetKycReq)
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

[**LiquidGetUnionResultRes**](LiquidGetUnionResultRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvJpStartPost"></a>
# **v1IdvJpStartPost**
> LiquidIntegratedAppRes v1IdvJpStartPost(authorization, liquidStartIdvReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val liquidStartIdvReq : LiquidStartIdvReq =  // LiquidStartIdvReq | 
try {
    val result : LiquidIntegratedAppRes = apiInstance.v1IdvJpStartPost(authorization, liquidStartIdvReq)
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
| **liquidStartIdvReq** | [**LiquidStartIdvReq**](LiquidStartIdvReq.md)|  | [optional] |

### Return type

[**LiquidIntegratedAppRes**](LiquidIntegratedAppRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvKycGetPost"></a>
# **v1IdvKycGetPost**
> GetKycRes v1IdvKycGetPost(authorization, getKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val getKycReq : GetKycReq =  // GetKycReq | 
try {
    val result : GetKycRes = apiInstance.v1IdvKycGetPost(authorization, getKycReq)
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

[**GetKycRes**](GetKycRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvSessionsStartPost"></a>
# **v1IdvSessionsStartPost**
> SessionStartRes v1IdvSessionsStartPost(authorization, sessionStartReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val sessionStartReq : SessionStartReq =  // SessionStartReq | 
try {
    val result : SessionStartRes = apiInstance.v1IdvSessionsStartPost(authorization, sessionStartReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvSessionsStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvSessionsStartPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionStartReq** | [**SessionStartReq**](SessionStartReq.md)|  | [optional] |

### Return type

[**SessionStartRes**](SessionStartRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvStartPost"></a>
# **v1IdvStartPost**
> StartIdvRes v1IdvStartPost(authorization, startIdvReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val startIdvReq : StartIdvReq =  // StartIdvReq | 
try {
    val result : StartIdvRes = apiInstance.v1IdvStartPost(authorization, startIdvReq)
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

[**StartIdvRes**](StartIdvRes.md)

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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

<a id="v1IdvUkStartPost"></a>
# **v1IdvUkStartPost**
> PlaidStartIdvRes v1IdvUkStartPost(authorization, plaidStartIdvReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val plaidStartIdvReq : PlaidStartIdvReq =  // PlaidStartIdvReq | 
try {
    val result : PlaidStartIdvRes = apiInstance.v1IdvUkStartPost(authorization, plaidStartIdvReq)
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
| **plaidStartIdvReq** | [**PlaidStartIdvReq**](PlaidStartIdvReq.md)|  | [optional] |

### Return type

[**PlaidStartIdvRes**](PlaidStartIdvRes.md)

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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

<a id="v1IdvUsStartPost"></a>
# **v1IdvUsStartPost**
> PlaidStartIdvRes v1IdvUsStartPost(authorization, plaidStartIdvReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val plaidStartIdvReq : PlaidStartIdvReq =  // PlaidStartIdvReq | 
try {
    val result : PlaidStartIdvRes = apiInstance.v1IdvUsStartPost(authorization, plaidStartIdvReq)
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
| **plaidStartIdvReq** | [**PlaidStartIdvReq**](PlaidStartIdvReq.md)|  | [optional] |

### Return type

[**PlaidStartIdvRes**](PlaidStartIdvRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1Oauth2TokenPost"></a>
# **v1Oauth2TokenPost**
> TokenRes v1Oauth2TokenPost(clientAssertion, clientAssertionType, grantType, resource, scope)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val clientAssertion : kotlin.String = clientAssertion_example // kotlin.String | 
val clientAssertionType : kotlin.String = clientAssertionType_example // kotlin.String | 
val grantType : kotlin.String = grantType_example // kotlin.String | 
val resource : kotlin.String = resource_example // kotlin.String | 
val scope : kotlin.String = scope_example // kotlin.String | 
try {
    val result : TokenRes = apiInstance.v1Oauth2TokenPost(clientAssertion, clientAssertionType, grantType, resource, scope)
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

[**TokenRes**](TokenRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json;charset=utf-8

