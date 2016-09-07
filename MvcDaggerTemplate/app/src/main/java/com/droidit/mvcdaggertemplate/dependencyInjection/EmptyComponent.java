package com.droidit.mvcdaggertemplate.dependencyInjection;

import com.droidit.mvcdaggertemplate.main.EmptyActivity;

import dagger.Component;

/**
 * Created by JohannesC on 05-Sep-16.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {NetworkModule.class})
public interface EmptyComponent {

    void inject(EmptyActivity emptyActivity);

}
