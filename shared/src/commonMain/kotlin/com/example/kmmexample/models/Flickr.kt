package com.example.kmmexample.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Flickr(
    @SerialName("small") val original: List<String>,
    @SerialName("original") val small: List<String>
)