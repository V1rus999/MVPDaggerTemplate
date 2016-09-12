package com.droidit.domain.posts;

import com.droidit.domain.DefaultCallback;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by JohannesC on 12-Sep-16.
 * "An interactor will fetch data from your database, web services, or any other data source"
 * This class will grow as a DB is added etc. Will scale well as network and db layers are changed.
 */
public class PostInteractor {

    private final PostService postService;

    @Inject
    public PostInteractor(PostService postService) {
        this.postService = postService;
    }

    public void getPosts(DefaultCallback<List<PostDto>> callback) {
        postService.getPosts(callback);
    }
}
