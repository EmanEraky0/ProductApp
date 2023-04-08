package com.example.productapp.data.repo

import com.example.productapp.domain.model.ProductItem
import com.example.productapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class FakeApiProductRepoTest :ApiHelper{

    private val productResponse = ArrayList<ProductItem>()
    override suspend fun getAllProducts(): Flow<Resource<ArrayList<ProductItem>>> {
        return flow {
            productResponse
        }
    }

}