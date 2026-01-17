package com.example.retrofitcat.view

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import com.example.retrofitcat.data.Cat
import com.example.retrofitcat.viewModel.PetsViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun PetList(onPetClicked: (Cat)-> Unit, pets: List<Cat>, modifier: Modifier){
    LazyColumn(modifier = modifier) {
        items(pets){pet->
            PetListItem(cat=pet,onPetClicked=onPetClicked)
        }
    }
}


@Composable
fun PetListItem(cat: Cat,onPetClicked: (Cat) -> Unit){
    ElevatedCard(modifier = Modifier.fillMaxWidth().padding(6.dp)) {
        Column(modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)) {
            AsyncImage(model="https://cataas.com/cat/${cat.id}",
                contentDescription = "Cute cut",
                modifier = Modifier.fillMaxWidth().height(200.dp),
                contentScale = ContentScale.FillWidth)
            FlowRow(modifier = Modifier.padding(start = 3.dp, end = 3.dp)) {
                repeat(cat.tags.size){
                    SuggestionChip(
                        modifier = Modifier.padding(start = 3.dp, end = 3.dp),
                        onClick = {},
                        label = {
                            Text(text = cat.tags[it])
                        }
                    )
                }
            }
        }
    }
}
