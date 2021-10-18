package com.naqi.classifiedapp.data.remote

import android.util.Log
import com.naqi.classifiedapp.utils.Resource
import retrofit2.Response

abstract class BaseDataSource {
    val ERROR_TAG = "ERROR_REMOTE_DATA_SOURCE"
    protected suspend fun <T> getResult(call: suspend () -> Response<T>): Resource<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) return Resource.success(body)
            }
            return error(" ${response.code()} ${response.message()}")
        } catch (e: Exception) {
            return error(e.message ?: e.toString())
        }
    }

    private fun <T> error(message: String): Resource<T> {
        Log.d(ERROR_TAG, message)
        return Resource.error("Network call has failed for a following reason: $message")
    }

}