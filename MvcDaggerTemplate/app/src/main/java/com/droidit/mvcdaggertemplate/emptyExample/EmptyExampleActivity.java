package com.droidit.mvcdaggertemplate.emptyExample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.droidit.mvcdaggertemplate.R;

/**
 * Created by JohannesC on 07-Sep-16.
 * Make this activity your launcher and rename to whatever
 */
public class EmptyExampleActivity extends AppCompatActivity {

    public static Intent getActivityIntent(Context context) {
        return new Intent(context, EmptyExampleActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
    }
}
