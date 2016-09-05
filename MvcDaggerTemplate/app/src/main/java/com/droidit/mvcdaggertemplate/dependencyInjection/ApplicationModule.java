package com.droidit.mvcdaggertemplate.dependencyInjection;

import android.content.Context;

import com.droidit.mvcdaggertemplate.DefaultApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JohannesC on 30-May-16.
 * Main module
 */
@Module
public class ApplicationModule {

    private final DefaultApplication mApplication;

    public ApplicationModule(DefaultApplication application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }
}
