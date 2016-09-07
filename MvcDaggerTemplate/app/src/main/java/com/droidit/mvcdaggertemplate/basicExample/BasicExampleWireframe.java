package com.droidit.mvcdaggertemplate.basicExample;

import android.app.Activity;
import android.content.Context;

import com.droidit.domain.basicExample.BasicExampleContract;
import com.droidit.mvcdaggertemplate.emptyExample.EmptyExampleActivity;

import javax.inject.Inject;

/**
 * Created by JohannesC on 07-Sep-16.
 * All navigation logic goes in here
 */
public class BasicExampleWireframe implements BasicExampleContract.WireFrame {

    private final Activity mContext;

    @Inject
    public BasicExampleWireframe(Activity context) {
        mContext = context;
    }

    @Override
    public void onConnectionButtonClicked() {
        mContext.startActivity(EmptyExampleActivity.getActivityIntent(mContext));
    }
}
