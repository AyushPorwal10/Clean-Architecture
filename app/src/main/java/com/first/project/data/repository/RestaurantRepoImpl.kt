package com.first.project.data.repository

import com.first.project.data.datasource.FakeRestaurantDataSource
import com.first.project.domain.model.Restaurant
import com.first.project.domain.repository.RestaurantRepo
import com.first.project.domain.value.RestaurantId
import javax.inject.Inject



class RestaurantRepoImpl @Inject constructor(
   val dataSource : FakeRestaurantDataSource
): RestaurantRepo {
    override suspend fun getAllRestaurants(): List<Restaurant> {
        return dataSource.restaurants
    }

    override suspend fun getRestaurant(id: RestaurantId): Restaurant {
        return dataSource.restaurants[0]
    }


}