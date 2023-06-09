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

import org.openapitools.client.models.CreateCompletionResponseLogprobs

import com.squareup.moshi.Json

/**
 * 
 * @param text 
 * @param index 
 * @param logprobs 
 * @param finishReason 
 */

data class CreateCompletionResponseChoices (
    @Json(name = "text")
    val text: kotlin.String? = null,
    @Json(name = "index")
    val index: kotlin.Int? = null,
    @Json(name = "logprobs")
    val logprobs: CreateCompletionResponseLogprobs? = null,
    @Json(name = "finish_reason")
    val finishReason: kotlin.String? = null
)

