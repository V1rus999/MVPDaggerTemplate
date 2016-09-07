package com.droidit.mvcdaggertemplate.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.droidit.domain.main.EmptyContract;
import com.droidit.domain.main.EmptyPresenter;
import com.droidit.mvcdaggertemplate.DefaultApplication;
import com.droidit.mvcdaggertemplate.R;
import com.droidit.mvcdaggertemplate.dependencyInjection.ApplicationComponent;
import com.droidit.mvcdaggertemplate.dependencyInjection.DaggerMainComponent;
import com.droidit.mvcdaggertemplate.dependencyInjection.EmptyComponent;

import javax.inject.Inject;

/**
 * Created by JohannesC on 30-May-16.
 * Basic activity, displays a list via Retrofit with the use of MVP
 */
public class EmptyActivity extends AppCompatActivity implements EmptyContract.View {

    private EmptyComponent mEmptyComponent;

    @Inject
    EmptyPresenter mEmptyPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initializeInjector();
        mEmptyPresenter.onCreate(this);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((DefaultApplication) this.getApplication()).getMainComponent();
    }

    private void initializeInjector() {
        this.mEmptyComponent = DaggerMainComponent.builder().applicationComponent(getApplicationComponent()).build();
        mEmptyComponent.inject(this);
    }
}
