package com.example.productapp.data.repo

import com.example.productapp.data.api.ApiService
import com.example.productapp.domain.model.ProductItem
import com.example.productapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiProductRepo @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getAllProducts():  Flow<Resource<ArrayList<ProductItem>>> {
        return flow {
            emit(Resource.loading(null))
            val resource = try {
                val product = apiService.getAllProducts()
                Resource.success(product)
            } catch (e: Throwable) {
                Resource.error(e.toString(), null)
            }
            emit(resource)
        }
    }
}