package com.droidit.domain.main;

import javax.inject.Inject;

/**
 * Created by JohannesC on 05-Sep-16.
 */
public class EmptyPresenter implements EmptyContract.Presenter {

    @Inject
    public EmptyPresenter() {
    }

    @Override
    public void onCreate(EmptyContract.View view) {

    }
}
