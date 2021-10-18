package com.naqi.classifiedapp.network

import com.google.gson.GsonBuilder
import com.naqi.classifiedapp.utils.Constants
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.FileInputStream
import java.security.cert.Certificate
import java.security.cert.CertificateFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class ApiClient @Inject constructor() {

    var retrofit: Retrofit? = null
    private val gson = GsonBuilder().create()

    private val httpLoggingInterceptor = HttpLoggingInterceptor().setLevel(
        HttpLoggingInterceptor.Level.BODY
    )
    private val okHttpClientBuilder = OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)


    var BASE_URL = Constants.BASE_URL

    fun <T> createService(serviceClass: Class<T>): T {
        okHttpClientBuilder.retryOnConnectionFailure(true)
        okHttpClientBuilder.readTimeout(60, TimeUnit.SECONDS)
        okHttpClientBuilder.writeTimeout(3, TimeUnit.MINUTES)

        val okHttpClient = okHttpClientBuilder
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()

        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build()
        }
        return retrofit!!.create(serviceClass)
    }

    val client: Retrofit?
        get() {
            val httpClient = OkHttpClient.Builder()
            httpClient.retryOnConnectionFailure(true)
            httpClient.readTimeout(60, TimeUnit.SECONDS)
            httpClient.addInterceptor(httpLoggingInterceptor)

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(httpClient.build())
                    .build()
            }
            return retrofit
        }

    val sslClient: Retrofit?
        get() {
            val certPin = CertificatePinner.pin(getCertificate())
            val certificatePinner = CertificatePinner.Builder()
                .add(BASE_URL, certPin)
                .build()
            val client = OkHttpClient.Builder()
                .certificatePinner(certificatePinner)
                .connectTimeout(5, TimeUnit.SECONDS)
                .build()
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        }

    private fun getCertificate(): Certificate {
        val cf = CertificateFactory.getInstance("X.509")
//        val caInput = context?.openFileInput("out.c")  This is the line that must be used in the code while getting certificate.
        val caInput = FileInputStream("out.c") // This line is just a placeholder.
        val ca: Certificate
        try {
            ca = cf.generateCertificate(caInput)
        } finally {
            caInput?.close()
        }
        return ca
    }
}