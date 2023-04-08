package com.example.productapp.presentation.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productapp.domain.model.ProductItem
import com.example.productapp.domain.usecases.getProductUseCase
import com.example.productapp.utils.NetworkHelper
import com.example.productapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor
    (private val mainRepositoryUseCase: getProductUseCase, private val networkHelper: NetworkHelper) :
    ViewModel() {
    private val _productItem =MutableSharedFlow<Resource<ArrayList<ProductItem>>>()
    var products = _productItem.asSharedFlow()


    fun getAllProductsResponse() {
        viewModelScope.launch {
            _productItem.emit(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepositoryUseCase.getAllProducts().collect {
                    _productItem.emit(it)
                }
            } else _productItem.emit(Resource.error("No internet connection", null))
        }
    }


}