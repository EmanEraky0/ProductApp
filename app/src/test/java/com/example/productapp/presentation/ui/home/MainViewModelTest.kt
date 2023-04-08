package com.example.productapp.presentation.ui.home

import com.example.productapp.data.repo.FakeApiProductRepoTest
import com.example.productapp.domain.model.ProductItem
import com.example.productapp.utils.NetworkHelper
import com.example.productapp.utils.Resource
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class MainViewModelTest {
    private lateinit var viewModel: MainViewModel

    private lateinit var flow: MutableSharedFlow<Resource<ArrayList<ProductItem>>>

//    private val apiService = mockk<ApiService>()
    private val networkHelper = mockk<NetworkHelper>()
    private val repository = mockk<FakeApiProductRepoTest>()


    @Before
    fun setup() {
        flow = MutableSharedFlow()
        viewModel = MainViewModel(repository, networkHelper)
    }


    @Test
    fun `test fetch data`() = runBlocking {
        val categories: ArrayList<ProductItem> = arrayListOf()
        categories.add(
            ProductItem(
                1,
                "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
                109.95,
                "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
                "men's clothing",
                "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",

                )
        )

        val expectedOutput = listOf(
            Resource.loading(null),
            Resource.success(categories)
        )
        val actualOutput = mutableListOf<Resource<ArrayList<ProductItem>>>()

        val expectedFlow = flow {
            emit(Resource.loading(null))
            emit(Resource.success(categories))
        }

        coEvery { repository.getAllProducts() } returns expectedFlow
        viewModel.getAllProductsResponse()

//        // Wait for a longer period to ensure the coroutine has completed
//        delay(5000)

        viewModel.products.collect {
            actualOutput.add(it)
        }
        assertEquals(expectedOutput, actualOutput)

    }
}