// Generated by Dagger (https://dagger.dev).
package com.example.productapp.presentation.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final ApplicationModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public ApplicationModule_ProvideRetrofitFactory(ApplicationModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, okHttpClientProvider.get());
  }

  public static ApplicationModule_ProvideRetrofitFactory create(ApplicationModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new ApplicationModule_ProvideRetrofitFactory(module, okHttpClientProvider);
  }

  public static Retrofit provideRetrofit(ApplicationModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit(okHttpClient));
  }
}
