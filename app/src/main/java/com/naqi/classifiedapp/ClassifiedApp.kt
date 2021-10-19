package com.naqi.classifiedapp

import android.app.Application
import com.naqi.imageloader.cache.memory.impl.WeakMemoryCache
import com.naqi.imageloader.core.DisplayImageOptions
import com.naqi.imageloader.core.ImageLoader
import com.naqi.imageloader.core.ImageLoaderConfiguration
import com.naqi.imageloader.core.display.FadeInBitmapDisplayer
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class ClassifiedApp : Application() {
    lateinit var imageLoader: ImageLoader
    override fun onCreate() {
        super.onCreate()
        val defaultOptions = DisplayImageOptions.Builder()
            .resetViewBeforeLoading(true)
            .cacheOnDisk(true)
            .cacheInMemory(true)
            .displayer(FadeInBitmapDisplayer(300))
            .build()

        val config = ImageLoaderConfiguration.Builder(applicationContext)
            .defaultDisplayImageOptions(defaultOptions)
            .memoryCache(WeakMemoryCache())
            .diskCacheSize(100 * 1024 * 1024)
            .build()

        imageLoader = ImageLoader.getInstance()
        imageLoader.init(config)

    }
}