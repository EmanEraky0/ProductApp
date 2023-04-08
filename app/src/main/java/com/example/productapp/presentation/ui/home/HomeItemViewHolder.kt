package com.example.productapp.presentation.ui.home

import androidx.recyclerview.widget.RecyclerView
import com.example.productapp.databinding.ItemProductBinding
import com.example.productapp.domain.model.ProductItem

class HomeItemViewHolder (
    private val itemBinding: ItemProductBinding,
    private val mItemClickListener: (ProductItem) -> Unit,

    ) : RecyclerView.ViewHolder(itemBinding.root) {

    private var requestItem: ProductItem? = null

    init {
        itemBinding.layClick.setOnClickListener {
            requestItem?.let { r -> mItemClickListener(r) }
        }

    }

    fun bind(requestItem: ProductItem) {
        this.requestItem = requestItem
        itemBinding.product = requestItem
    }
}