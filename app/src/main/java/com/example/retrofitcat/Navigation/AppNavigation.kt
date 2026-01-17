package com.example.retrofitcat.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringArrayResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.retrofitcat.view.PetView

@Composable
fun AppNavigation(){
    val navController= rememberNavController()
    NavHost(navController=navController, startDestination = Screens.PetsScreen.route){
        composable(Screens.PetsScreen.route)
        {
            PetView()
        }
    }
}