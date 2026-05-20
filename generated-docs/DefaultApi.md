# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**v1IdvCaHealthGet**](DefaultApi.md#v1IdvCaHealthGet) | **GET** /v1/idv/ca/health |  |
| [**v1IdvCaKycGetPost**](DefaultApi.md#v1IdvCaKycGetPost) | **POST** /v1/idv/ca/kyc/get |  |
| [**v1IdvCaStartPost**](DefaultApi.md#v1IdvCaStartPost) | **POST** /v1/idv/ca/start |  |
| [**v1IdvCnHealthGet**](DefaultApi.md#v1IdvCnHealthGet) | **GET** /v1/idv/cn/health |  |
| [**v1IdvCnKycGetPost**](DefaultApi.md#v1IdvCnKycGetPost) | **POST** /v1/idv/cn/kyc/get |  |
| [**v1IdvCnStartPost**](DefaultApi.md#v1IdvCnStartPost) | **POST** /v1/idv/cn/start |  |
| [**v1IdvCnTokenPost**](DefaultApi.md#v1IdvCnTokenPost) | **POST** /v1/idv/cn/token |  |
| [**v1IdvHealthGet**](DefaultApi.md#v1IdvHealthGet) | **GET** /v1/idv/health |  |
| [**v1IdvJpHealthGet**](DefaultApi.md#v1IdvJpHealthGet) | **GET** /v1/idv/jp/health |  |
| [**v1IdvJpKycGetPost**](DefaultApi.md#v1IdvJpKycGetPost) | **POST** /v1/idv/jp/kyc/get |  |
| [**v1IdvJpStartPost**](DefaultApi.md#v1IdvJpStartPost) | **POST** /v1/idv/jp/start |  |
| [**v1IdvKycGetPost**](DefaultApi.md#v1IdvKycGetPost) | **POST** /v1/idv/kyc/get |  |
| [**v1IdvResultPost**](DefaultApi.md#v1IdvResultPost) | **POST** /v1/idv/result |  |
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



[DEPRECATED] Use /v1/idv/health.

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
> UsGetUnionResultRes v1IdvCaKycGetPost(authorization, usGetKycReq)



[DEPRECATED] Use /v1/idv/result with country&#x3D;ca.

### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val usGetKycReq : UsGetKycReq =  // UsGetKycReq | 
try {
    val result : UsGetUnionResultRes = apiInstance.v1IdvCaKycGetPost(authorization, usGetKycReq)
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
| **usGetKycReq** | [**UsGetKycReq**](UsGetKycReq.md)|  | [optional] |

### Return type

[**UsGetUnionResultRes**](UsGetUnionResultRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCaStartPost"></a>
# **v1IdvCaStartPost**
> StartIdvRes v1IdvCaStartPost(authorization, caStartIdvReq)



[DEPRECATED] Use /v1/idv/start with country&#x3D;ca.

### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val caStartIdvReq : CaStartIdvReq =  // CaStartIdvReq | 
try {
    val result : StartIdvRes = apiInstance.v1IdvCaStartPost(authorization, caStartIdvReq)
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
| **caStartIdvReq** | [**CaStartIdvReq**](CaStartIdvReq.md)|  | [optional] |

### Return type

[**StartIdvRes**](StartIdvRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnHealthGet"></a>
# **v1IdvCnHealthGet**
> kotlin.String v1IdvCnHealthGet()



[DEPRECATED] Use /v1/idv/health.

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
> CnGetUnionResultRes v1IdvCnKycGetPost(authorization, cnGetKycReq)



[DEPRECATED] Use /v1/idv/result with country&#x3D;cn.

### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val cnGetKycReq : CnGetKycReq =  // CnGetKycReq | 
try {
    val result : CnGetUnionResultRes = apiInstance.v1IdvCnKycGetPost(authorization, cnGetKycReq)
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
| **cnGetKycReq** | [**CnGetKycReq**](CnGetKycReq.md)|  | [optional] |

### Return type

[**CnGetUnionResultRes**](CnGetUnionResultRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnStartPost"></a>
# **v1IdvCnStartPost**
> StartIdvRes v1IdvCnStartPost(authorization, cnStartIdvReq)



[DEPRECATED] Use /v1/idv/start with country&#x3D;cn.

### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val cnStartIdvReq : CnStartIdvReq =  // CnStartIdvReq | 
try {
    val result : StartIdvRes = apiInstance.v1IdvCnStartPost(authorization, cnStartIdvReq)
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
| **cnStartIdvReq** | [**CnStartIdvReq**](CnStartIdvReq.md)|  | [optional] |

### Return type

[**StartIdvRes**](StartIdvRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnTokenPost"></a>
# **v1IdvCnTokenPost**
> TomoIdvIssueTokenRes v1IdvCnTokenPost(authorization, tomoIdvIssueTokenReq)



[DEPRECATED] Use the OAuth2 token endpoint.

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

<a id="v1IdvHealthGet"></a>
# **v1IdvHealthGet**
> kotlin.String v1IdvHealthGet()



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.String = apiInstance.v1IdvHealthGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvHealthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvHealthGet")
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

<a id="v1IdvJpHealthGet"></a>
# **v1IdvJpHealthGet**
> kotlin.String v1IdvJpHealthGet()



[DEPRECATED] Use /v1/idv/health.

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
> JpGetUnionResultRes v1IdvJpKycGetPost(authorization, jpGetKycReq)



[DEPRECATED] Use /v1/idv/result with country&#x3D;jp.

### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val jpGetKycReq : JpGetKycReq =  // JpGetKycReq | 
try {
    val result : JpGetUnionResultRes = apiInstance.v1IdvJpKycGetPost(authorization, jpGetKycReq)
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
| **jpGetKycReq** | [**JpGetKycReq**](JpGetKycReq.md)|  | [optional] |

### Return type

[**JpGetUnionResultRes**](JpGetUnionResultRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvJpStartPost"></a>
# **v1IdvJpStartPost**
> StartIdvRes v1IdvJpStartPost(authorization, jpStartIdvReq)



[DEPRECATED] Use /v1/idv/start with country&#x3D;jp.

### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val jpStartIdvReq : JpStartIdvReq =  // JpStartIdvReq | 
try {
    val result : StartIdvRes = apiInstance.v1IdvJpStartPost(authorization, jpStartIdvReq)
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
| **jpStartIdvReq** | [**JpStartIdvReq**](JpStartIdvReq.md)|  | [optional] |

### Return type

[**StartIdvRes**](StartIdvRes.md)

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

<a id="v1IdvResultPost"></a>
# **v1IdvResultPost**
> ResultRes v1IdvResultPost(authorization, resultReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val resultReq : ResultReq =  // ResultReq | 
try {
    val result : ResultRes = apiInstance.v1IdvResultPost(authorization, resultReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvResultPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvResultPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resultReq** | [**ResultReq**](ResultReq.md)|  | [optional] |

### Return type

[**ResultRes**](ResultRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvSessionsStartPost"></a>
# **v1IdvSessionsStartPost**
> SessionStartRes v1IdvSessionsStartPost(authorization, sessionStartReq)



[DEPRECATED] Use /v1/idv/start.

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



[DEPRECATED] Use /v1/idv/health.

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
> UsGetUnionResultRes v1IdvUkKycGetPost(authorization, usGetKycReq)



[DEPRECATED] Use /v1/idv/result with country&#x3D;uk.

### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val usGetKycReq : UsGetKycReq =  // UsGetKycReq | 
try {
    val result : UsGetUnionResultRes = apiInstance.v1IdvUkKycGetPost(authorization, usGetKycReq)
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
| **usGetKycReq** | [**UsGetKycReq**](UsGetKycReq.md)|  | [optional] |

### Return type

[**UsGetUnionResultRes**](UsGetUnionResultRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUkStartPost"></a>
# **v1IdvUkStartPost**
> StartIdvRes v1IdvUkStartPost(authorization, ukStartIdvReq)



[DEPRECATED] Use /v1/idv/start with country&#x3D;uk.

### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val ukStartIdvReq : UkStartIdvReq =  // UkStartIdvReq | 
try {
    val result : StartIdvRes = apiInstance.v1IdvUkStartPost(authorization, ukStartIdvReq)
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
| **ukStartIdvReq** | [**UkStartIdvReq**](UkStartIdvReq.md)|  | [optional] |

### Return type

[**StartIdvRes**](StartIdvRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUsHealthGet"></a>
# **v1IdvUsHealthGet**
> kotlin.String v1IdvUsHealthGet()



[DEPRECATED] Use /v1/idv/health.

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
> UsGetUnionResultRes v1IdvUsKycGetPost(authorization, usGetKycReq)



[DEPRECATED] Use /v1/idv/result with country&#x3D;us.

### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val usGetKycReq : UsGetKycReq =  // UsGetKycReq | 
try {
    val result : UsGetUnionResultRes = apiInstance.v1IdvUsKycGetPost(authorization, usGetKycReq)
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
| **usGetKycReq** | [**UsGetKycReq**](UsGetKycReq.md)|  | [optional] |

### Return type

[**UsGetUnionResultRes**](UsGetUnionResultRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvUsStartPost"></a>
# **v1IdvUsStartPost**
> StartIdvRes v1IdvUsStartPost(authorization, usStartIdvReq)



[DEPRECATED] Use /v1/idv/start with country&#x3D;us.

### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val usStartIdvReq : UsStartIdvReq =  // UsStartIdvReq | 
try {
    val result : StartIdvRes = apiInstance.v1IdvUsStartPost(authorization, usStartIdvReq)
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
| **usStartIdvReq** | [**UsStartIdvReq**](UsStartIdvReq.md)|  | [optional] |

### Return type

[**StartIdvRes**](StartIdvRes.md)

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

