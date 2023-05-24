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
 * @param document 
 * @param text 
 * @param label 
 */

data class CreateClassificationResponseSelectedExamples (
    @Json(name = "document")
    val document: kotlin.Int? = null,
    @Json(name = "text")
    val text: kotlin.String? = null,
    @Json(name = "label")
    val label: kotlin.String? = null
)

