package com.first.project.data.datasource

import com.first.project.domain.model.Restaurant
import com.first.project.domain.value.ImageUrl
import com.first.project.domain.value.Rating
import com.first.project.domain.value.RestaurantId
import com.first.project.domain.value.RestaurantName
import javax.inject.Inject


class FakeRestaurantDataSource @Inject constructor(

){

    val restaurants: List<Restaurant> = listOf(

        Restaurant(
            id = RestaurantId("r1"),
            name = RestaurantName("Punjabi Dhaba"),
            image = ImageUrl("https://picsum.photos/400/300?1"),
            rating = Rating(4.5)
        ),

        Restaurant(
            id = RestaurantId("r2"),
            name = RestaurantName("South Spice"),
            image = ImageUrl("https://picsum.photos/400/300?2"),
            rating = Rating(4.3)
        ),

        Restaurant(
            id = RestaurantId("r3"),
            name = RestaurantName("Bombay Bistro"),
            image = ImageUrl("https://picsum.photos/400/300?3"),
            rating = Rating(4.1)
        ),

        Restaurant(
            id = RestaurantId("r4"),
            name = RestaurantName("Veg Delight"),
            image = ImageUrl("https://picsum.photos/400/300?4"),
            rating = Rating(4.6)
        ),

        Restaurant(
            id = RestaurantId("r5"),
            name = RestaurantName("Urban Tandoor"),
            image = ImageUrl("https://picsum.photos/400/300?5"),
            rating = Rating(4.0)
        )
    )
}
