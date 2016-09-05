package com.droidit.mvcdaggertemplate.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.droidit.domain.main.MainContract;
import com.droidit.domain.main.MainPresenter;
import com.droidit.mvcdaggertemplate.DefaultApplication;
import com.droidit.mvcdaggertemplate.R;
import com.droidit.mvcdaggertemplate.dependencyInjection.ApplicationComponent;
import com.droidit.mvcdaggertemplate.dependencyInjection.DaggerMainComponent;
import com.droidit.mvcdaggertemplate.dependencyInjection.MainComponent;

import javax.inject.Inject;

/**
 * Created by JohannesC on 30-May-16.
 * Basic activity, displays a list via Retrofit with the use of MVP
 */
public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainComponent mMainComponent;

    @Inject
    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initializeInjector();
        mMainPresenter.onCreate(this);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((DefaultApplication) this.getApplication()).getMainComponent();
    }

    private void initializeInjector() {
        this.mMainComponent = DaggerMainComponent.builder().applicationComponent(getApplicationComponent()).build();
        mMainComponent.inject(this);
    }
}
