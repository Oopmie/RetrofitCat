package com.example.retrofitcat.data

interface PetsRepository {
    suspend fun getPets(): NetworkResult<List<Cat>>
}