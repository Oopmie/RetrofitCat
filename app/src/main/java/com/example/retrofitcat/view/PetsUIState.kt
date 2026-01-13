package com.example.retrofitcat.view

import com.example.retrofitcat.data.Cat

data class PetsUIState(
    val isLoading: Boolean=false,
    val pets: List<Cat> =emptyList(),
    val error: String?=null
)