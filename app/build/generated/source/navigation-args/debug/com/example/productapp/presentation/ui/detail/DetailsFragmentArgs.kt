package com.example.productapp.presentation.ui.detail

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.productapp.domain.model.ProductItem
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailsFragmentArgs(
  public val product: ProductItem
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ProductItem::class.java)) {
      result.putParcelable("product", this.product as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProductItem::class.java)) {
      result.putSerializable("product", this.product as Serializable)
    } else {
      throw UnsupportedOperationException(ProductItem::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ProductItem::class.java)) {
      result.set("product", this.product as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProductItem::class.java)) {
      result.set("product", this.product as Serializable)
    } else {
      throw UnsupportedOperationException(ProductItem::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __product : ProductItem?
      if (bundle.containsKey("product")) {
        if (Parcelable::class.java.isAssignableFrom(ProductItem::class.java) ||
            Serializable::class.java.isAssignableFrom(ProductItem::class.java)) {
          __product = bundle.get("product") as ProductItem?
        } else {
          throw UnsupportedOperationException(ProductItem::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__product == null) {
          throw IllegalArgumentException("Argument \"product\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"product\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__product)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailsFragmentArgs {
      val __product : ProductItem?
      if (savedStateHandle.contains("product")) {
        if (Parcelable::class.java.isAssignableFrom(ProductItem::class.java) ||
            Serializable::class.java.isAssignableFrom(ProductItem::class.java)) {
          __product = savedStateHandle.get<ProductItem?>("product")
        } else {
          throw UnsupportedOperationException(ProductItem::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__product == null) {
          throw IllegalArgumentException("Argument \"product\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"product\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__product)
    }
  }
}
