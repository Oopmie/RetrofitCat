package com.example.retrofitcat.data

import kotlinx.serialization.SerialName

data class Cat(
    @SerialName("id")
    val id: String,
    @SerialName("tags")
    val tags: List<String>,
    @SerialName("createAt")
    val createAt: String
)
