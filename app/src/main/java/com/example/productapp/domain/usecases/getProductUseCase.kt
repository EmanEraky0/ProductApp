package com.example.productapp.domain.usecases

import com.example.productapp.data.repo.ApiHelper
import javax.inject.Inject

open class getProductUseCase @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getAllProducts() =
        apiHelper.getAllProducts()


}