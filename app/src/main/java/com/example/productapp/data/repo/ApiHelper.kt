package com.example.productapp.data.repo

import com.example.productapp.domain.model.ProductItem
import com.example.productapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface ApiHelper {
    suspend fun getAllProducts(): Flow<Resource<ArrayList<ProductItem>>>




}