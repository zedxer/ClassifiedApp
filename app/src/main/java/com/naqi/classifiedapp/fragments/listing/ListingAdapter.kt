package com.naqi.classifiedapp.fragments.listing

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.naqi.classifiedapp.databinding.ResultItemBinding
import com.naqi.classifiedapp.models.ResultItem
import com.naqi.classifiedapp.utils.Utils.formatDate

class ListingAdapter(private val listener: ItemListener) :
    RecyclerView.Adapter<ListingViewHolder>() {
    private val items = ArrayList<ResultItem>()

    interface ItemListener {
        fun onClickedItem(characterId: String)

    }

    fun setItems(items: ArrayList<ResultItem>) {
        this.items.clear()
        this.items.addAll(items)
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListingViewHolder {
        val binding: ResultItemBinding =
            ResultItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListingViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: ListingViewHolder, position: Int) =
        holder.bind(items[position])

    override fun getItemCount(): Int = items.size
}

class ListingViewHolder(
    private val itemBinding: ResultItemBinding,
    private val listener: ListingAdapter.ItemListener
) : RecyclerView.ViewHolder(itemBinding.root),
    View.OnClickListener {

    private lateinit var item: ResultItem

    init {
        itemBinding.root.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    fun bind(item: ResultItem) {
        this.item = item
        itemBinding.name.text = item.name
        itemBinding.price.text = item.price
        itemBinding.dateOfCreation.text = formatDate(item.created_at)
//        Glide.with(itemBinding.root)
//            .load(item.image)
//            .transform(CircleCrop())
//            .into(itemBinding.image)
    }

    override fun onClick(v: View?) {
        listener.onClickedItem(item.uid)
    }
}


