package ru.itmo.api.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ru.itmo.api.model.Book
import ru.itmo.api.model.Pageable
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
 * @param totalPages
 * @param totalElements
 * @param propertySize
 * @param content
 * @param number
 * @param sort
 * @param first
 * @param pageable
 * @param last
 * @param numberOfElements
 * @param empty
 */
data class BookPage(

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("totalPages", required = true) val totalPages: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("totalElements", required = true) val totalElements: kotlin.Long,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("size", required = true) val propertySize: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("content", required = true) val content: kotlin.collections.List<Book>,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("number", required = true) val number: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("sort", required = true) val sort: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("first", required = true) val first: kotlin.Boolean,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("pageable", required = true) val pageable: Pageable,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("last", required = true) val last: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("numberOfElements", required = true) val numberOfElements: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("empty", required = true) val empty: kotlin.Boolean
) {

}

