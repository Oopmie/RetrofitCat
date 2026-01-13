package com.example.retrofitcat.di

import com.example.retrofitcat.data.CatsAPI
import com.example.retrofitcat.data.PetsRepository
import com.example.retrofitcat.data.PetsRepositoryImpl
import com.example.retrofitcat.viewModel.PetsViewModel
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModules= module {
    single<PetsRepository> { PetsRepositoryImpl(get(),get()) }
    single { Dispatchers.IO }
    single { PetsViewModel(get()) }
    single {
        Retrofit.Builder().baseUrl("https://cataas.com/api/").
                addConverterFactory(GsonConverterFactory.create()).
                client(OkHttpClient()).build()
    }
    single { get<Retrofit>().create(CatsAPI::class.java) }
}