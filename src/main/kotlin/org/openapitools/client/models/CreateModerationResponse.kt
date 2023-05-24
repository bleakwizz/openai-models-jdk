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

import org.openapitools.client.models.CreateModerationResponseResults

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param model 
 * @param results 
 */

data class CreateModerationResponse (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "model")
    val model: kotlin.String,
    @Json(name = "results")
    val results: kotlin.collections.List<CreateModerationResponseResults>
)

