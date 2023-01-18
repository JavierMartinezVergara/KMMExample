package com.example.kmmexample.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Links(
    @SerialName("article") val article: String? = null,
    @SerialName("flickr") val flickr: Flickr,
    @SerialName("patch") val patch: Patch,
    @SerialName("presskit") val presskit: String? = null,
    @SerialName("reddit") val reddit: Reddit,
    @SerialName("webcast") val webcast: String? = null,
    @SerialName("wikipedia") val wikipedia: String? = null,
    @SerialName("youtube_id") val youtube_id: String? = null
)