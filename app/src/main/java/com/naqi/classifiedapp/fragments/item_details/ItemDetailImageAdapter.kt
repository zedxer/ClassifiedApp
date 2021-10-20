package com.naqi.classifiedapp.fragments.item_details

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.naqi.classifiedapp.ClassifiedApp
import com.naqi.classifiedapp.databinding.ItemDetailImageBinding
import com.naqi.classifiedapp.databinding.ResultItemBinding
import com.naqi.classifiedapp.fragments.listing.ListingViewHolder
import com.naqi.classifiedapp.models.ResultItem
import com.naqi.classifiedapp.utils.Utils
import com.naqi.imageloader.core.assist.FailReason
import com.naqi.imageloader.core.listener.ImageLoadingListener
import java.util.*

class ItemDetailImageAdapter(private val context: Context?) :
    RecyclerView.Adapter<ItemDetailImageViewHolder>() {

    private val items = ArrayList<String> ()

    interface ItemListener {
        fun onClickedItem(itemJson: String)
    }

    fun setItems(items: ArrayList<String>) {
        this.items.clear()
        this.items.addAll(items)
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemDetailImageViewHolder {
        val binding: ItemDetailImageBinding =
            ItemDetailImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemDetailImageViewHolder(binding, context)
    }

    override fun onBindViewHolder(holder: ItemDetailImageViewHolder, position: Int) =
        holder.bind(items[position])

    override fun getItemCount(): Int = items.size
}

class ItemDetailImageViewHolder(
    private val itemBinding: ItemDetailImageBinding,
    private val context: Context?,
) : RecyclerView.ViewHolder(itemBinding.root) {
    private lateinit var item: String

    @SuppressLint("SetTextI18n")
    fun bind(item: String) {
        this.item = item


        val imageLoader = (context?.applicationContext as ClassifiedApp).imageLoader
        imageLoader.displayImage(
            item,
            itemBinding.itemImage, object:ImageLoadingListener{
                override fun onLoadingStarted(imageUri: String?, view: View?) {
                    itemBinding.itemImageProgress.visibility = View.VISIBLE
                }

                override fun onLoadingFailed(
                    imageUri: String?,
                    view: View?,
                    failReason: FailReason?
                ) {
                    itemBinding.itemImageProgress.visibility = View.GONE

                }

                override fun onLoadingComplete(
                    imageUri: String?,
                    view: View?,
                    loadedImage: Bitmap?
                ) {
                    itemBinding.itemImageProgress.visibility = View.GONE

                }

                override fun onLoadingCancelled(imageUri: String?, view: View?) {

                }

            }
        )
    }
}