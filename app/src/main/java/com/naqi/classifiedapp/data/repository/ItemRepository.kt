package com.naqi.classifiedapp.data.repository

import com.naqi.classifiedapp.data.remote.ItemRemoteDataSource
import com.naqi.classifiedapp.utils.performGetOperation
import javax.inject.Inject

class ItemRepository @Inject constructor(
    private val remoteDataSource: ItemRemoteDataSource
) {

    fun getListing() = performGetOperation(
        networkCall = { remoteDataSource.getListing() }
    )

}