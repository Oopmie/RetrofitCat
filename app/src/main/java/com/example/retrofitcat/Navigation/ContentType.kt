package com.example.retrofitcat.Navigation

sealed interface ContentType {
    object List: ContentType
    object ListAndDetails: ContentType
}