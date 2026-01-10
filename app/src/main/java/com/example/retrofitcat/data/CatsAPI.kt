package com.example.retrofitcat.data

import retrofit2.Response
import retrofit2.http.GET

interface CatsAPI {
    @GET("cats")
    suspend fun fetchCats(): Response<List<Cat>>
}