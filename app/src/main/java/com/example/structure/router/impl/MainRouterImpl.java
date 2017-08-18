package com.example.structure.router.impl;

import com.example.R;
import com.example.structure.router.MainRouter;
import com.example.ui.MainActivity;
import com.example.ui.MyFragment;


import javax.inject.Inject;

public class MainRouterImpl extends BaseRouterImpl<MainActivity> implements MainRouter {

    @Inject
    public MainRouterImpl(MainActivity activity) {
        super(activity);
    }


    @Override
    public void showSomeScreen() {
        replaceFragment(R.id.content, new MyFragment());
    }
}
