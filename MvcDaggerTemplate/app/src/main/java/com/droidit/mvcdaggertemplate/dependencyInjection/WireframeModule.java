package com.droidit.mvcdaggertemplate.dependencyInjection;

import android.app.Activity;

import com.droidit.domain.basicExample.BasicExampleContract;
import com.droidit.mvcdaggertemplate.basicExample.BasicExampleWireframe;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JohannesC on 07-Sep-16.
 */
@Module
public class WireframeModule {

    private final Activity mActivity;

    public WireframeModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    public Activity provideActivity() {
        return mActivity;
    }

    @Provides
    public BasicExampleContract.WireFrame provideBasicExampleWireframe(BasicExampleWireframe basicExampleWireframe) {
        return basicExampleWireframe;
    }
}
