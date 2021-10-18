package com.naqi.classifiedapp.data.remote

import com.naqi.classifiedapp.network.APIInterface
import javax.inject.Inject

class ItemRemoteDataSource  @Inject constructor(
    private val listingService: APIInterface
): BaseDataSource() {

    suspend fun getListing() = getResult { listingService.getListing() }
}