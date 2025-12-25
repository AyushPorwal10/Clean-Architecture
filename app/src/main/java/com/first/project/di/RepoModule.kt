package com.first.project.di

import com.first.project.data.repository.RestaurantRepoImpl
import com.first.project.domain.repository.RestaurantRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {

     @Binds
     @Singleton
     abstract fun providesHomeImpl(restaurantRepoImpl: RestaurantRepoImpl) : RestaurantRepo

}