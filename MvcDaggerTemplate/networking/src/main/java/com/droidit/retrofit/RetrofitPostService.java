package com.droidit.retrofit;

import com.droidit.domain.DefaultCallback;
import com.droidit.domain.posts.PostDto;
import com.droidit.domain.posts.PostService;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by JohannesC on 12-Sep-16.
 */
public class RetrofitPostService implements PostService {

    private final Retrofit retrofit;

    @Inject
    public RetrofitPostService(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    @Override
    public void getPosts(final DefaultCallback<List<PostDto>> postCallback) {
        PostsApi postsApi = retrofit.create(PostsApi.class);
        Call<List<PostDto>> call = postsApi.getPosts();
        call.enqueue(new Callback<List<PostDto>>() {
            @Override
            public void onResponse(Call<List<PostDto>> call, Response<List<PostDto>> response) {
                if (response.isSuccessful()) {
                    postCallback.onSuccess(response.body());
                } else {
                    postCallback.onFailure(new Throwable(response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<PostDto>> call, Throwable t) {
                postCallback.onFailure(t);
            }
        });
    }
}
