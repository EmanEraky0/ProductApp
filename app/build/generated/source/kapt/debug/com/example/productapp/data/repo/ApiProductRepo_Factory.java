// Generated by Dagger (https://dagger.dev).
package com.example.productapp.data.repo;

import com.example.productapp.data.api.ApiService;
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
public final class ApiProductRepo_Factory implements Factory<ApiProductRepo> {
  private final Provider<ApiService> apiServiceProvider;

  public ApiProductRepo_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ApiProductRepo get() {
    return newInstance(apiServiceProvider.get());
  }

  public static ApiProductRepo_Factory create(Provider<ApiService> apiServiceProvider) {
    return new ApiProductRepo_Factory(apiServiceProvider);
  }

  public static ApiProductRepo newInstance(ApiService apiService) {
    return new ApiProductRepo(apiService);
  }
}
