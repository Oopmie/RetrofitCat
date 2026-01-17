package com.example.retrofitcat.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.retrofitcat.data.Cat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PetsScreen(onPetClicked:(Cat)-> Unit){
    Scaffold(
        topBar = {
            TopAppBar(title = {Text(text = "Pets")},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        },
        content = {paddingValues ->
          //  PetList(onPetClicked=onPetClicked,  modifier = Modifier.fillMaxSize().padding(paddingValues))
        }
    )
}