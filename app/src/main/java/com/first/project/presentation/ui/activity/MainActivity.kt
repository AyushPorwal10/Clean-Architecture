package com.first.project.presentation.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import com.first.project.presentation.ui.screen.RestaurantMainScreen
import com.first.project.presentation.viewmodel.RestaurantViewModel
import com.first.project.ui.theme.AndroidTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val restaurantViewModel by viewModels<RestaurantViewModel>()
        enableEdgeToEdge()
        setContent {
            AndroidTheme {
                Scaffold(
                    modifier = Modifier.Companion.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("Restaurant App")
                            }
                        )
                    }) { innerPadding ->
                    RestaurantMainScreen(
                        modifier = Modifier.padding(innerPadding),
                        restaurantViewModel = restaurantViewModel
                    )
                }
            }
        }
    }
}