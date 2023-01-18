package com.example.kmmexample.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Fairings(


  @SerialName("reused") val reused: Boolean? = null,
  @SerialName("recovery_attempt") val recovery_attempt: Boolean? = null,
  @SerialName("recovered") val recovered: Boolean? = null,
  @SerialName("ships") val landingType: List<String>? = null,


)