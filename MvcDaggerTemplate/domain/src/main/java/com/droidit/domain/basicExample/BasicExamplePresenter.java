package com.droidit.domain.basicExample;

import javax.inject.Inject;

/**
 * Created by JohannesC on 05-Sep-16.
 * View tells the Presenter about state and the Presenter instructs the View to do something.
 */
public class BasicExamplePresenter implements BasicExampleContract.Presenter {

    private final BasicExampleContract.WireFrame mBasicExampleWireframe;
    private BasicExampleContract.View mView;

    @Inject
    public BasicExamplePresenter(BasicExampleContract.WireFrame basicExampleWireframe) {
        mBasicExampleWireframe = basicExampleWireframe;
    }

    @Override
    public void onCreate(BasicExampleContract.View view) {
        mView = view;
    }

    @Override
    public void onConnectionButtonClicked() {
        mBasicExampleWireframe.onConnectionButtonClicked();
    }
}
