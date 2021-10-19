package com.naqi.classifiedapp.fragments.item_details

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.naqi.classifiedapp.R
import com.naqi.classifiedapp.databinding.ItemDetailFragmentBinding
import com.naqi.classifiedapp.databinding.ListingFragmentBinding
import com.naqi.classifiedapp.fragments.listing.ListingViewModel
import com.naqi.classifiedapp.utils.autoCleared
import dagger.hilt.android.AndroidEntryPoint

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
        setData()
        setupObservers()
    }

    fun setData() {}
    fun setupObservers() {}

}