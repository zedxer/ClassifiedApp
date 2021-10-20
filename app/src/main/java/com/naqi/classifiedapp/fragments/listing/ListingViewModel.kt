package com.naqi.classifiedapp.fragments.listing

import androidx.lifecycle.ViewModel
import com.naqi.classifiedapp.data.repository.ItemRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListingViewModel @Inject constructor(
    private val repository: ItemRepository
) : ViewModel() {
    var listOfItems = repository.getListing()

    fun refreshItems() {
        listOfItems = repository.getListing()
    }
}