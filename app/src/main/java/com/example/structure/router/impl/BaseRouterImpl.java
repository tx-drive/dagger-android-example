package com.example.structure.router.impl;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.base.BaseActivity;

abstract public class BaseRouterImpl<A extends BaseActivity> {
    private A activity;
    private FragmentManager fragmentManager;

    public BaseRouterImpl(A activity) {
        this.activity = activity;
        this.fragmentManager = activity.getSupportFragmentManager();
    }


    public void replaceFragment(int content, Fragment fragment) {
        fragmentManager.beginTransaction()
                .add(content, fragment)
                .commit();
    }
}
