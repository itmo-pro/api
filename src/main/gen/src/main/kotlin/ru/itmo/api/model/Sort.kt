package ru.itmo.api.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param empty 
 * @param sorted 
 * @param unsorted 
 */
data class Sort(

    @Schema(example = "null", description = "")
    @field:JsonProperty("empty") val empty: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @field:JsonProperty("sorted") val sorted: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @field:JsonProperty("unsorted") val unsorted: kotlin.Boolean? = null
) {

}

