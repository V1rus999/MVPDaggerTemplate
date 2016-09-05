package com.droidit.mvcdaggertemplate.dependencyInjection;

import com.droidit.mvcdaggertemplate.main.MainActivity;

import dagger.Component;

/**
 * Created by V1rus on 05-Sep-16.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {NetworkModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
