package com.naqi.classifiedapp.fragments.listing

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.naqi.classifiedapp.R
import com.naqi.classifiedapp.databinding.ListingFragmentBinding
import com.naqi.classifiedapp.utils.Constants.ITEM_JSON_KEY
import com.naqi.classifiedapp.utils.Resource
import com.naqi.classifiedapp.utils.autoCleared
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListingFragment : Fragment(), ListingAdapter.ItemListener {
    private var binding: ListingFragmentBinding by autoCleared()
    private val viewModel: ListingViewModel by viewModels()
    private lateinit var adapter: ListingAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ListingFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.listOfItems.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Resource.Status.SUCCESS -> {
                    binding.refreshLayout.isRefreshing = false
                    binding.progressBar.visibility = View.GONE
                    if (!it.data!!.results.isNullOrEmpty()) adapter.setItems(ArrayList(it.data.results))
                }
                Resource.Status.ERROR ->{
                    Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
                    binding.refreshLayout.isRefreshing = false
                }

                Resource.Status.LOADING ->
                    binding.progressBar.visibility = View.VISIBLE
            }
        })
        binding.refreshLayout.setOnRefreshListener {
            viewModel.refreshItems()
        }
    }

    private fun setupRecyclerView() {
        adapter = ListingAdapter(this, context)
        binding.listingRv.layoutManager = LinearLayoutManager(requireContext())
        binding.listingRv.adapter = adapter
    }

    override fun onClickedItem(itemJson: String) {
        findNavController().navigate(
            R.id.action_listingFragment_to_itemDetailFragment,
            bundleOf(ITEM_JSON_KEY to itemJson)

        )
    }
}