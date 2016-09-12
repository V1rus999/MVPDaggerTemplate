package com.droidit.mvcdaggertemplate.dependencyInjection;

import com.droidit.domain.basicExample.BasicExampleContract;
import com.droidit.domain.basicExample.BasicExamplePresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JohannesC on 07-Sep-16.
 */
@Module
public class PresenterModule {

    @Provides
    public BasicExampleContract.Presenter provideBasicExamplePresenter(BasicExamplePresenter basicExamplePresenter) {
        return basicExamplePresenter;
    }
}
