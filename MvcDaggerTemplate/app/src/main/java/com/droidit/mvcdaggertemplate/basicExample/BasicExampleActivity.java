package com.droidit.mvcdaggertemplate.basicExample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.droidit.domain.basicExample.BasicExampleContract;
import com.droidit.mvcdaggertemplate.DefaultApplication;
import com.droidit.mvcdaggertemplate.R;
import com.droidit.mvcdaggertemplate.dependencyInjection.ApplicationComponent;
import com.droidit.mvcdaggertemplate.dependencyInjection.BasicExampleComponent;
import com.droidit.mvcdaggertemplate.dependencyInjection.DaggerBasicExampleComponent;
import com.droidit.mvcdaggertemplate.dependencyInjection.WireframeModule;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JohannesC on 30-May-16.
 * Basic activity which shows MVP, navigation, and some networking logic
 */
public class BasicExampleActivity extends AppCompatActivity implements BasicExampleContract.View {

    private BasicExampleComponent basicExampleComponent;

    @Inject
    BasicExampleContract.Presenter basicExamplePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        this.initializeInjector();
        basicExamplePresenter.onCreate(this);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((DefaultApplication) this.getApplication()).getMainComponent();
    }

    private void initializeInjector() {
        this.basicExampleComponent = DaggerBasicExampleComponent.builder()
                .applicationComponent(getApplicationComponent())
                .wireframeModule(new WireframeModule(this))
                .build();
        basicExampleComponent.inject(this);
    }

    @OnClick(R.id.activity_main_launch_connection_btn)
    public void onLaunchConnectionBtnClick() {
        basicExamplePresenter.onConnectionButtonClicked();
    }
}
