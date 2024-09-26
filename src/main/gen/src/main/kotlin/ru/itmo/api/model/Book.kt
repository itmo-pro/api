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
 * @param name
 * @param author
 * @param year
 * @param id
 */
data class Book(

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("author", required = true) val author: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("year", required = true) val year: kotlin.Int,

    @Schema(example = "null", description = "")
    @field:JsonProperty("id") val id: java.util.UUID? = null
) {

}

