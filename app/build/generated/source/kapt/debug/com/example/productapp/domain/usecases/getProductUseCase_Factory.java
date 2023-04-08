// Generated by Dagger (https://dagger.dev).
package com.example.productapp.domain.usecases;

import com.example.productapp.data.repo.ApiHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class getProductUseCase_Factory implements Factory<getProductUseCase> {
  private final Provider<ApiHelper> apiHelperProvider;

  public getProductUseCase_Factory(Provider<ApiHelper> apiHelperProvider) {
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public getProductUseCase get() {
    return newInstance(apiHelperProvider.get());
  }

  public static getProductUseCase_Factory create(Provider<ApiHelper> apiHelperProvider) {
    return new getProductUseCase_Factory(apiHelperProvider);
  }

  public static getProductUseCase newInstance(ApiHelper apiHelper) {
    return new getProductUseCase(apiHelper);
  }
}