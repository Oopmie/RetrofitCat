package com.example.retrofitcat.data

import org.w3c.dom.Notation

sealed class NetworkResult<out T> {
    data class Success<out T>(val data:T): NetworkResult<T>()
    data class Error(val error: String): NetworkResult<Nothing>()
}