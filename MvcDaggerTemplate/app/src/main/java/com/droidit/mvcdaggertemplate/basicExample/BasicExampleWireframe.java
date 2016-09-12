package com.droidit.mvcdaggertemplate.basicExample;

import android.app.Activity;

import com.droidit.domain.basicExample.BasicExampleContract;
import com.droidit.mvcdaggertemplate.emptyExample.EmptyExampleActivity;

import javax.inject.Inject;

/**
 * Created by JohannesC on 07-Sep-16.
 * All navigation logic goes in here
 */
public class BasicExampleWireframe implements BasicExampleContract.WireFrame {

    private final Activity context;

    @Inject
    public BasicExampleWireframe(Activity context) {
        this.context = context;
    }

    @Override
    public void onConnectionButtonClicked() {
        context.startActivity(EmptyExampleActivity.getActivityIntent(context));
    }
}
