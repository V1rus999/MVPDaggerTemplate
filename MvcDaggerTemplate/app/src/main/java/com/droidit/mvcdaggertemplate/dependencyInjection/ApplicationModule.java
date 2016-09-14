package com.droidit.mvcdaggertemplate.dependencyInjection;

import android.content.Context;

import com.droidit.domain.threading.BackgroundExecutor;
import com.droidit.domain.threading.MainThread;
import com.droidit.mvcdaggertemplate.DefaultApplication;
import com.droidit.mvcdaggertemplate.UIThread;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JohannesC on 30-May-16.
 * Main module
 */
@Module
public class ApplicationModule {

    private final DefaultApplication application;

    public ApplicationModule(DefaultApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return application.getApplicationContext();
    }

    @Provides
    @Singleton
    Executor provideThreadExecutor(BackgroundExecutor backgroundExecutor) {
        return backgroundExecutor;
    }

    @Provides
    @Singleton
    MainThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }
}
