package com.naqi.classifiedapp.fragments.item_details

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.AppBarLayout
import com.google.gson.Gson
import com.naqi.classifiedapp.R
import com.naqi.classifiedapp.databinding.ItemDetailFragmentBinding
import com.naqi.classifiedapp.databinding.ListingFragmentBinding
import com.naqi.classifiedapp.fragments.listing.ListingViewModel
import com.naqi.classifiedapp.models.ResultItem
import com.naqi.classifiedapp.utils.Constants.ITEM_JSON_KEY
import com.naqi.classifiedapp.utils.Utils
import com.naqi.classifiedapp.utils.autoCleared
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class ItemDetailFragment : Fragment() {
    private var binding: ItemDetailFragmentBinding by autoCleared()
    private val viewModel: ItemDetailViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ItemDetailFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getString(ITEM_JSON_KEY)?.let {
            setData(it)
        }

        setListeners()
        setupObservers()
    }

    @SuppressLint("SetTextI18n")
    fun setData(itemJson: String) {
        val item = Gson().fromJson(itemJson, ResultItem::class.java)
        binding.itemCreationDate.text = "Posted on ${Utils.formatDate(item.created_at)}"
        binding.itemName.text = item.name.capitalize(Locale.US)
        binding.itemPrice.text = item.price

    }

    fun setListeners() {
        binding.appBarLayout.addOnOffsetChangedListener(object :
            AppBarLayout.OnOffsetChangedListener {
            var isShow = true
            var scrollRange = -1

            @SuppressLint("SetTextI18n")
            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
                appBarLayout.post {
                    if (scrollRange == -1) {
                        scrollRange = appBarLayout.totalScrollRange
                    }
                    if (scrollRange + verticalOffset == 0) {
                        //                    collapsingToolbarLayout.title = "" + holySite!!.enName
                        binding.titleOfItem.text = " ${binding.itemName.text}"
                        isShow = true
                    } else if (isShow) {
                        //                    collapsingToolbarLayout.title = " "// careful there should a space between double quote otherwise it wont work
                        binding.titleOfItem.text =
                            " "// careful there should a space between double quote otherwise it wont work
                        isShow = false
                    }
                }
            }
        })

        val appBarConfiguration = AppBarConfiguration(this.findNavController().graph)
        binding.toolbar.setupWithNavController(this.findNavController(), appBarConfiguration)
    }

    fun setupObservers() {}

}