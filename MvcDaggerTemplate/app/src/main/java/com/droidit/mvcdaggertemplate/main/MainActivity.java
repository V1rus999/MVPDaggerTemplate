package com.droidit.mvcdaggertemplate.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.droidit.mvcdaggertemplate.R;

/**
 * Created by JohannesC on 30-May-16.
 * Basic activity, displays a list via Retrofit with the use of MVP
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
