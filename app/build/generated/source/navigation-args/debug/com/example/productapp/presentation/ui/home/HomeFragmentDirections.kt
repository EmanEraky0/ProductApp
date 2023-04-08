package com.example.productapp.presentation.ui.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.productapp.R
import com.example.productapp.domain.model.ProductItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToDetailsFragment(
    public val product: ProductItem
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_detailsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionHomeFragmentToDetailsFragment(product: ProductItem): NavDirections =
        ActionHomeFragmentToDetailsFragment(product)
  }
}
