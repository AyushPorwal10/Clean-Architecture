package com.first.project.domain.usecase

import com.first.project.domain.model.Restaurant
import com.first.project.domain.repository.RestaurantRepo
import com.first.project.domain.value.RestaurantId
import javax.inject.Inject

class GetRestaurantUseCase @Inject constructor(
    private val restaurantRepo: RestaurantRepo
) {
     suspend operator fun invoke(restaurantId : RestaurantId)  : Restaurant{
        return restaurantRepo.getRestaurant(id = restaurantId)
    }
}