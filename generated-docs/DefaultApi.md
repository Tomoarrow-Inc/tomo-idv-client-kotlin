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
| [**v1IdvJpHealthGet**](DefaultApi.md#v1IdvJpHealthGet) | **GET** /v1/idv/jp/health |  |
| [**v1IdvJpKycGetPost**](DefaultApi.md#v1IdvJpKycGetPost) | **POST** /v1/idv/jp/kyc/get |  |
| [**v1IdvJpStartPost**](DefaultApi.md#v1IdvJpStartPost) | **POST** /v1/idv/jp/start |  |
| [**v1IdvKycGetPost**](DefaultApi.md#v1IdvKycGetPost) | **POST** /v1/idv/kyc/get |  |
| [**v1IdvSocialGoogleStartPost**](DefaultApi.md#v1IdvSocialGoogleStartPost) | **POST** /v1/idv/social/google/start |  |
| [**v1IdvSocialResultPost**](DefaultApi.md#v1IdvSocialResultPost) | **POST** /v1/idv/social/result |  |
| [**v1IdvSocialWechatStartPost**](DefaultApi.md#v1IdvSocialWechatStartPost) | **POST** /v1/idv/social/wechat/start |  |
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
> PlaidStartIdvResp v1IdvCaStartPost(authorization, plaidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
> TencentGetUnionResultResp v1IdvCnKycGetPost(authorization, tencentGetKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val tencentGetKycReq : TencentGetKycReq =  // TencentGetKycReq | 
try {
    val result : TencentGetUnionResultResp = apiInstance.v1IdvCnKycGetPost(authorization, tencentGetKycReq)
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

[**TencentGetUnionResultResp**](TencentGetUnionResultResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvCnStartPost"></a>
# **v1IdvCnStartPost**
> TomoIdvStartRes v1IdvCnStartPost(authorization, tomoIdvStartReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
> kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt; v1IdvJpKycGetPost(authorization, liquidGetKycReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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

<a id="v1IdvJpStartPost"></a>
# **v1IdvJpStartPost**
> LiquidIntegratedAppResponse v1IdvJpStartPost(authorization, liquidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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

<a id="v1IdvSocialGoogleStartPost"></a>
# **v1IdvSocialGoogleStartPost**
> GoogleStartResp v1IdvSocialGoogleStartPost(authorization, googleStartReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val googleStartReq : GoogleStartReq =  // GoogleStartReq | 
try {
    val result : GoogleStartResp = apiInstance.v1IdvSocialGoogleStartPost(authorization, googleStartReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvSocialGoogleStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvSocialGoogleStartPost")
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

<a id="v1IdvSocialResultPost"></a>
# **v1IdvSocialResultPost**
> GetKycResp v1IdvSocialResultPost(authorization, socialResultReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val socialResultReq : SocialResultReq =  // SocialResultReq | 
try {
    val result : GetKycResp = apiInstance.v1IdvSocialResultPost(authorization, socialResultReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvSocialResultPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvSocialResultPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialResultReq** | [**SocialResultReq**](SocialResultReq.md)|  | [optional] |

### Return type

[**GetKycResp**](GetKycResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a id="v1IdvSocialWechatStartPost"></a>
# **v1IdvSocialWechatStartPost**
> WeChatStartResp v1IdvSocialWechatStartPost(authorization, weChatStartReq)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

val apiInstance = DefaultApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val weChatStartReq : WeChatStartReq =  // WeChatStartReq | 
try {
    val result : WeChatStartResp = apiInstance.v1IdvSocialWechatStartPost(authorization, weChatStartReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#v1IdvSocialWechatStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#v1IdvSocialWechatStartPost")
    e.printStackTrace()
}
```

### Parameters
| **authorization** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **weChatStartReq** | [**WeChatStartReq**](WeChatStartReq.md)|  | [optional] |

### Return type

[**WeChatStartResp**](WeChatStartResp.md)

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
> PlaidStartIdvResp v1IdvUkStartPost(authorization, plaidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
> PlaidStartIdvResp v1IdvUsStartPost(authorization, plaidStartIdvRequest)



### Example
```kotlin
// Import classes:
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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
//import com.tomoarrow.idv.client.generated.infrastructure.*
//import com.tomoarrow.idv.client.generated.models.*

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

