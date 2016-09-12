package com.droidit.domain.basicExample;

import javax.inject.Inject;

/**
 * Created by JohannesC on 05-Sep-16.
 * View tells the Presenter about state and the Presenter instructs the View to do something.
 */
public class BasicExamplePresenter implements BasicExampleContract.Presenter {

    private final BasicExampleContract.WireFrame wireframe;
    private BasicExampleContract.View view;

    @Inject
    public BasicExamplePresenter(BasicExampleContract.WireFrame basicExampleWireframe) {
        wireframe = basicExampleWireframe;
    }

    @Override
    public void onCreate(BasicExampleContract.View view) {
        this.view = view;
    }

    @Override
    public void onConnectionButtonClicked() {
        wireframe.onConnectionButtonClicked();
    }
}
