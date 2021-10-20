package com.naqi.classifiedapp.network

import com.naqi.classifiedapp.models.ItemListModel
import com.naqi.classifiedapp.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface APIInterface {
    @GET(Constants.LISTING_ENDPOINT)
    suspend fun getListing(): Response<ItemListModel>
}