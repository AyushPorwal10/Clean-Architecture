package com.first.project.presentation.ui.screen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.first.project.presentation.ui.state.UiState
import com.first.project.presentation.ui.components.RestaurantCard
import com.first.project.presentation.viewmodel.RestaurantViewModel


@Composable
fun RestaurantMainScreen(
    modifier: Modifier,
    restaurantViewModel: RestaurantViewModel
) {

    LaunchedEffect(Unit){
        restaurantViewModel.getAllRestaurants()
    }
    val restaurantUiState by restaurantViewModel.restaurantList.collectAsStateWithLifecycle()

    when (val state = restaurantUiState) {
        is UiState.Loading -> {
            LoadingScreen(modifier)
        }

        is UiState.Error -> {
            ErrorScreen(modifier)
        }

        is UiState.Success -> {
            LazyColumn(
                modifier = modifier.padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(state.data) {
                    RestaurantCard(it, onClick = {

                    })
                }
            }
        }
    }

}

@Composable
fun ErrorScreen(modifier: Modifier) {
        Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(
                "Something went wrong\nPlease try again later",
                color = Color.Red,
                fontSize = 24.sp
            )
        }
}

@Composable
fun LoadingScreen(modifier: Modifier) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        CircularProgressIndicator(
            modifier = Modifier.size(32.dp),
            color = Color.Black,
        )
    }
}
