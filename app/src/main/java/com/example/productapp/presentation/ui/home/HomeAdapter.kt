package com.example.productapp.presentation.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.productapp.R
import com.example.productapp.databinding.ItemProductBinding
import com.example.productapp.domain.model.ProductItem

class HomeAdapter(private var mItemsList: ArrayList<ProductItem>,
                  private val mItemClickListener: (ProductItem) -> Unit, ):
    RecyclerView.Adapter<HomeItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = DataBindingUtil.inflate<ItemProductBinding>(
            layoutInflater,
            R.layout.item_product,
            parent,
            false
        )
        return HomeItemViewHolder(itemBinding, mItemClickListener)
    }

    override fun onBindViewHolder(
        holder: HomeItemViewHolder, position: Int) {
        holder.bind(mItemsList[position])
    }

    override fun getItemCount(): Int = mItemsList.size

    fun updateData( mItemsList: ArrayList<ProductItem>){
        this.mItemsList =mItemsList
        notifyDataSetChanged()
    }
}