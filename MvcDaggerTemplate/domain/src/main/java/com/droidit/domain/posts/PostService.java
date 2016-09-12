package com.droidit.domain.posts;

import com.droidit.domain.DefaultCallback;

import java.util.List;

/**
 * Created by JohannesC on 12-Sep-16.
 */
public interface PostService {

    void getPosts(DefaultCallback<List<PostDto>> postCallback);
}
