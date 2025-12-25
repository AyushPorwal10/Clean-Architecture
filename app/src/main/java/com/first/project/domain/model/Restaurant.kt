package com.first.project.domain.model

import com.first.project.domain.value.ImageUrl
import com.first.project.domain.value.Rating
import com.first.project.domain.value.RestaurantId
import com.first.project.domain.value.RestaurantName


data class Restaurant(
    val id : RestaurantId,
    val name : RestaurantName,
    val image : ImageUrl,
    val rating : Rating
)
