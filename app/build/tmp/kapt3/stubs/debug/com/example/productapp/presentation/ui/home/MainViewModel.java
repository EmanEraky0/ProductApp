package com.example.productapp.presentation.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/example/productapp/presentation/ui/home/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepositoryUseCase", "Lcom/example/productapp/domain/usecases/getProductUseCase;", "networkHelper", "Lcom/example/productapp/utils/NetworkHelper;", "(Lcom/example/productapp/domain/usecases/getProductUseCase;Lcom/example/productapp/utils/NetworkHelper;)V", "_productItem", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/productapp/utils/Resource;", "Ljava/util/ArrayList;", "Lcom/example/productapp/domain/model/ProductItem;", "products", "Lkotlinx/coroutines/flow/SharedFlow;", "getProducts", "()Lkotlinx/coroutines/flow/SharedFlow;", "setProducts", "(Lkotlinx/coroutines/flow/SharedFlow;)V", "getAllProductsResponse", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.productapp.domain.usecases.getProductUseCase mainRepositoryUseCase = null;
    private final com.example.productapp.utils.NetworkHelper networkHelper = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.productapp.utils.Resource<java.util.ArrayList<com.example.productapp.domain.model.ProductItem>>> _productItem = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.SharedFlow<? extends com.example.productapp.utils.Resource<? extends java.util.ArrayList<com.example.productapp.domain.model.ProductItem>>> products;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.productapp.domain.usecases.getProductUseCase mainRepositoryUseCase, @org.jetbrains.annotations.NotNull()
    com.example.productapp.utils.NetworkHelper networkHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.example.productapp.utils.Resource<java.util.ArrayList<com.example.productapp.domain.model.ProductItem>>> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.SharedFlow<? extends com.example.productapp.utils.Resource<? extends java.util.ArrayList<com.example.productapp.domain.model.ProductItem>>> p0) {
    }
    
    public final void getAllProductsResponse() {
    }
}