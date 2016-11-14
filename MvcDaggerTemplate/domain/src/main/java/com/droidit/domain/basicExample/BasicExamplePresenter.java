package com.droidit.domain.basicExample;

import com.droidit.domain.DefaultCallback;
import com.droidit.domain.posts.PostDto;
import com.droidit.domain.posts.PostInteractor;

import java.util.List;
import java.util.Random;

import javax.inject.Inject;

/**
 * Created by JohannesC on 05-Sep-16.
 * View tells the Presenter about state and the Presenter instructs the View to do something.
 */
public class BasicExamplePresenter implements BasicExampleContract.Presenter {

    private final BasicExampleContract.WireFrame wireframe;
    private final PostInteractor postInteractor;
    private BasicExampleContract.View view;

    @Inject
    public BasicExamplePresenter(BasicExampleContract.WireFrame basicExampleWireframe, PostInteractor postInteractor) {
        wireframe = basicExampleWireframe;
        this.postInteractor = postInteractor;
    }

    @Override
    public void onCreate(BasicExampleContract.View view) {
        this.view = view;
    }

    @Override
    public void onConnectionButtonClicked() {
        wireframe.onConnectionButtonClicked();
    }

    @Override
    public void onGetPostsBtnClicked() {
        postInteractor.getPosts(new DefaultCallback<List<PostDto>>() {
            @Override
            public void onSuccess(List<PostDto> success) {
                Random random = new Random();
                int randomPost = random.nextInt(success.size());
                view.displaySinglePostTitle(success.get(randomPost).title);
            }

            @Override
            public void onFailure(Throwable throwable) {
                view.displayConnectionError(throwable.getMessage());
            }
        });
    }
}
