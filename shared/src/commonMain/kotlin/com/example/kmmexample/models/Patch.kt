package com.example.kmmexample.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Patch(
    @SerialName("large") val large: String? = null,
    @SerialName("small") val small: String? = null
)