package com.example.retrofitcat.Navigation


sealed class Screens(val route: String) {
    object PetsScreen: Screens("Pets")
    object PetDetailScreen: Screens("PetDetails")
}