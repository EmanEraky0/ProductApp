package com.example.productapp.presentation.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.productapp.R
import com.example.productapp.databinding.FragmentHomeBinding
import com.example.productapp.domain.model.ProductItem
import com.example.productapp.utils.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = _binding!!
    private val viewModel: MainViewModel by viewModels()
    private lateinit var adapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater)
        adapter = HomeAdapter(arrayListOf(), onItemClick)
        binding.mainAdapter = adapter

        viewModel.getAllProductsResponse()

        setObserveProducts()
        return binding.root
    }

    fun setObserveProducts() {
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.products.collect {
                when (it.status) {
                    Status.SUCCESS -> {
                        binding.progressBar.visibility = View.GONE
                        it.data?.let { product ->
                            adapter.updateData(product)
                        }
                        binding.recyclerView.visibility = View.VISIBLE
                    }
                    Status.ERROR -> {
                        binding.progressBar.visibility = View.GONE
                        Toast.makeText(requireContext(), it.message, Toast.LENGTH_LONG).show()
                    }
                    Status.LOADING -> {
                        binding.progressBar.visibility = View.VISIBLE
                        binding.recyclerView.visibility = View.GONE
                    }
                }
            }

        }
    }


    private val onItemClick: ( req: ProductItem) -> Unit = { _it ->
        val bundle = Bundle()
        bundle.putParcelable("product", _it)
        findNavController().navigate(R.id.action_homeFragment_to_detailsFragment,bundle)

    }


}