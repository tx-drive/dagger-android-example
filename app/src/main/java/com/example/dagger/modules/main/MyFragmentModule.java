package com.example.dagger.modules.main;

import com.example.structure.presenter.MyView;
import com.example.ui.MyFragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MyFragmentModule {

    @Binds
    public abstract MyView myView(MyFragment myFragment);

    @Provides
    @Named("someId")
    public static int provideSomeId(MyFragment myFragment) {
        return myFragment.getSomeId();
    }
}
