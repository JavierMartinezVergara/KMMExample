package com.example.kmmexample.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RockItem(
    @SerialName("auto_update") val auto_update: Boolean,
    @SerialName("capsules") val capsules: List<String>,
    @SerialName("cores") val cores: List<Core>,
    @SerialName("crew") val crew: List<String>,
    @SerialName("date_local") val date_local: String,
    @SerialName("date_precision") val date_precision: String,
    @SerialName("date_unix") val date_unix: Int,
    @SerialName("date_utc") val date_utc: String,
    @SerialName("details") val details: String,
    @SerialName("failures") val failures: List<Failure>,
    @SerialName("fairings") val fairings: Fairings,
    @SerialName("flight_number") val flight_number: Int,
    @SerialName("id") val id: String,
    @SerialName("launch_library_id") val launch_library_id: String,
    @SerialName("launchpad") val launchpad: String,
    @SerialName("links") val links: Links,
    @SerialName("name") val name: String,
    @SerialName("net") val net: Boolean,
    @SerialName("payloads") val payloads: List<String>,
    @SerialName("rocket") val rocket: String,
    @SerialName("ships") val ships: List<String>,
    @SerialName("static_fire_date_unix") val static_fire_date_unix: Int,
    @SerialName("static_fire_date_utc") val static_fire_date_utc: String,
    @SerialName("success") val success: Boolean,
    @SerialName("tbd") val tbd: Boolean,
    @SerialName("upcoming") val upcoming: Boolean,
    @SerialName("window") val window: Int
)