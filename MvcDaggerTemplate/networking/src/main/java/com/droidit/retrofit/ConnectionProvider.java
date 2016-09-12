package com.droidit.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by JohannesC on 12-Sep-16.
 */
public class ConnectionProvider {

    @Inject
    public ConnectionProvider() {
    }

    public <S> S buildConnectionHandler(final Class<S> apiClass, String baseUrl) {
        //Add the header and NTLM auth
        OkHttpClient.Builder client = new OkHttpClient.Builder();

        if (!baseUrl.endsWith("/")) {
            baseUrl += "/";
        }

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .create();

        //Build
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client.build())
                .build();

        return retrofit.create(apiClass);
    }
}
