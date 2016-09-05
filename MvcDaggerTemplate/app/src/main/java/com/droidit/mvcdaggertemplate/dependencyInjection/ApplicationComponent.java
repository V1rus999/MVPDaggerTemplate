package com.droidit.mvcdaggertemplate.dependencyInjection;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by JohannesC on 30-May-16.
 * Main component exposing graphs to rest of app
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Context context();

}
