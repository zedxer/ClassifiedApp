package com.naqi.classifiedapp.fragments.listing

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.naqi.classifiedapp.data.repository.ItemRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListingViewModel @Inject constructor(
   private val repository: ItemRepository
) : ViewModel() {


    var itemText = MutableLiveData<String>().apply {
        value = "This text is from live data"
    }
    var flag = false
    fun userClick() {
        flag = !flag
        itemText.value =
            if (flag) {
                "When user click text"
            } else {
                "When user click text Again"
            }
    }


    var listOfItems = repository.getListing()

//    fun getDataFromServer() {
//        APIManager().getListing(
//            object : Callback<ItemListModel> {
//                override fun onResponse(
//                    call: Call<ItemListModel>,
//                    response: Response<ItemListModel>
//                ) {
//                    listOfItems.value = Pair(response.body(), true)
//                }
//
//                override fun onFailure(call: Call<ItemListModel>, t: Throwable) {
//                    listOfItems.value = Pair(null, false)
//                }
//            },
//        )
//    }
}