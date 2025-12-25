package com.first.project.domain.usecase

import com.first.project.domain.model.Restaurant
import com.first.project.domain.repository.RestaurantRepo
import javax.inject.Inject


// use case should contains business logic like action , rules
// here below we can see that we are sorting based on rating , but what if in future we want to sort
// based on price , and if we use this in viewmodel and same logic is used in 10 viewmodel (for example), we have to
// make changes to 10 viewmodel , but what if all 10 viewmodel (for example)  have usecase that is resued at all places
// we can make change at one place and here we go

class GetAllRestaurantUseCase @Inject constructor(
    private val restaurantRepo: RestaurantRepo
) {
    suspend operator fun invoke() : List<Restaurant>{
        return restaurantRepo.getAllRestaurants()
            .sortedBy { it.rating.value }
    }
}