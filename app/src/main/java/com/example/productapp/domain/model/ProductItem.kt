package com.example.productapp.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class ProductItem(
    val id: Int = 0,
    val title: String? = null,
    val price: Double = 0.0,
    val description: String? = null,
    val category :String ="",
    val image: String? = null,

    val rating: Ratings = Ratings(),
    ):  Parcelable

