package com.first.project.domain.value


@JvmInline
value class Rating(val value : Double){
    init {
        require(value in 0.0 .. 5.0){
            "Rating must be between 0 and 5"
        }
    }
}

@JvmInline
value class ImageUrl(val value : String)

@JvmInline
value class RestaurantId(val value : String)


@JvmInline
value class RestaurantName(val value : String)