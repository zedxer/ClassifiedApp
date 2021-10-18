package com.naqi.classifiedapp.models

data class ItemListModel(
    val pagination: Pagination = Pagination(),
    val results: ArrayList<ResultItem> = arrayListOf()
)

data class Pagination(
    val key: Int? = 0
)

data class ResultItem(
    val created_at: String = "",
    val image_ids: ArrayList<String> = arrayListOf(),
    val image_urls: ArrayList<String> = arrayListOf(),
    val image_urls_thumbnails: ArrayList<String> = arrayListOf(),
    val name: String = "",
    val price: String = "",
    val uid: String = ""
)