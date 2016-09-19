package com.droidit.mvcdaggertemplate.dependencyInjection;

import com.droidit.domain.posts.PostService;
import com.droidit.domain.threading.BackgroundExecutor;
import com.droidit.retrofit.RetrofitPostService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by JohannesC on 01-Jun-16.
 */
@Module
public class NetworkModule {

    private final String baseUrl;

    public NetworkModule(final String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Provides
    public GsonConverterFactory provideGson() {
        return GsonConverterFactory.create();
    }

    @Provides
    public Retrofit provideApiClient(GsonConverterFactory gsonConverterFactory, BackgroundExecutor backgroundExecutor) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .callbackExecutor(backgroundExecutor)
                .addConverterFactory(gsonConverterFactory)
                .build();
    }

    @Provides
    public PostService providePostService(RetrofitPostService retrofitPostService) {
        return retrofitPostService;
    }
}
