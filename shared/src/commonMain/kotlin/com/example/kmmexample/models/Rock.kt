package com.example.kmmexample.models

import kotlinx.serialization.Serializable

@Serializable
class Rock(
    val item : List<RockItem>
)