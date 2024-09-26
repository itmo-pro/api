package ru.itmo.api.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ru.itmo.api.model.Sort
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
 * @param offset
 * @param sort
 * @param pageNumber
 * @param pageSize
 * @param unpaged
 * @param paged
 */
data class Pageable(

    @Schema(example = "null", description = "")
    @field:JsonProperty("offset") val offset: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @field:JsonProperty("sort") val sort: Sort? = null,

    @Schema(example = "null", description = "")
    @field:JsonProperty("pageNumber") val pageNumber: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @field:JsonProperty("pageSize") val pageSize: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @field:JsonProperty("unpaged") val unpaged: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @field:JsonProperty("paged") val paged: kotlin.Boolean? = null
) {

}

