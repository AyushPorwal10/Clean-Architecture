package com.first.project.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.first.project.domain.model.Restaurant
import com.first.project.domain.usecase.GetAllRestaurantUseCase
import com.first.project.domain.usecase.GetRestaurantUseCase
import com.first.project.domain.value.RestaurantId
import com.first.project.presentation.ui.state.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class RestaurantViewModel @Inject constructor(
    val getAllRestaurantUseCase: GetAllRestaurantUseCase,
    val getRestaurantUseCase: GetRestaurantUseCase
)  : ViewModel() {





    private val _restaurantList =
        MutableStateFlow<UiState<List<Restaurant>>>(UiState.Loading)

    val restaurantList: StateFlow<UiState<List<Restaurant>>> =
        _restaurantList.asStateFlow()

    fun getAllRestaurants() {
        viewModelScope.launch {
            _restaurantList.value = UiState.Loading
            try {
                val result = getAllRestaurantUseCase()

                _restaurantList.value = UiState.Success(result)
            } catch (e: Exception) {
                _restaurantList.value = UiState.Error(
                    e.message ?: "Something went wrong"
                )
            }
        }
    }
    fun getRestaurantUserCase(restaurantId: RestaurantId) {
        viewModelScope.launch {
            val specificRestaurant = getRestaurantUseCase(restaurantId)
            // can be used to show details of specific restaurant
        }
    }


}