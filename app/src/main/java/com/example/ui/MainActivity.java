package com.example.ui;

import android.os.Bundle;

import com.example.R;
import com.example.base.BaseActivity;
import com.example.structure.router.MainRouter;

import javax.inject.Inject;


public class MainActivity extends BaseActivity {
    @Inject
    MainRouter router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        router.showSomeScreen();
    }


}
