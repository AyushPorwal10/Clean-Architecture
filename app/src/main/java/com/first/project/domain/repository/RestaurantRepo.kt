package com.first.project.domain.repository

import com.first.project.domain.model.Restaurant
import com.first.project.domain.value.RestaurantId

interface RestaurantRepo {
   suspend fun getAllRestaurants() : List<Restaurant>


   suspend fun getRestaurant(id : RestaurantId) : Restaurant
}