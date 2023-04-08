package com.example.productapp.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ratings(
    val rate: Double = 0.0,
    val count: Int = 0
) : Parcelable
