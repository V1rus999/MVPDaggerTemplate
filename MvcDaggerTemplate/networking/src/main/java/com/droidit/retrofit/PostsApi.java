package com.droidit.retrofit;

import com.droidit.domain.posts.PostDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JohannesC on 01-Jun-16.
 */
public interface PostsApi {

    @GET("/posts")
    Call<List<PostDto>> getPosts();

}
