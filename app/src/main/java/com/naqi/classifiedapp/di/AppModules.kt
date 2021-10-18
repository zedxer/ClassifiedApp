package com.naqi.classifiedapp.di

import com.naqi.classifiedapp.network.APIInterface
import com.naqi.classifiedapp.network.ApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModules {

    @Provides
    fun createAPIServices(apiClient: ApiClient): APIInterface{
        return apiClient.createService(APIInterface::class.java)
    }
}