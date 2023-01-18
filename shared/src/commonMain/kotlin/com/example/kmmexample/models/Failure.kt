package com.example.kmmexample.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable

data class Failure(
    @SerialName("altitude") val altitude: Int? = null,
    @SerialName("reason") val reason: String,
    @SerialName("time") val time: Int
)