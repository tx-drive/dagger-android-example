package com.example.dagger.modules.main;

import com.example.structure.presenter.MyView;
import com.example.ui.MyFragment;

import dagger.Binds;
import dagger.Module;

@Module
public interface MyFragmentModule {

    @Binds
    MyView myView(MyFragment myFragment);
}
