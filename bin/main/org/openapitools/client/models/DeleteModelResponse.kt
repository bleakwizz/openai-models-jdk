/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 1.2.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param `object` 
 * @param deleted 
 */

data class DeleteModelResponse (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "object")
    val `object`: kotlin.String,
    @Json(name = "deleted")
    val deleted: kotlin.Boolean
)

