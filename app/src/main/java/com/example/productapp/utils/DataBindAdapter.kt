package com.example.productapp.utils

import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatRatingBar
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy


@BindingAdapter("android:productImage")
fun setImageUrl(view: AppCompatImageView, path: String) {

    if (path != "") {
        Glide.with(view.context).asBitmap().load(path)
            .diskCacheStrategy(DiskCacheStrategy.ALL).dontAnimate().into(view)
    }

}


@BindingAdapter("android:valueRate")
fun setValueRate(view: AppCompatRatingBar, rate: Double) {
    view.rating = rate.toFloat()

}



