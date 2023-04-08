package com.example.productapp.data.api

import com.example.productapp.domain.model.ProductItem
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getAllProducts(): ArrayList<ProductItem>



}