package com.example.dagger.modules.main;

import com.example.dagger.scopes.ActivityScope;
import com.example.dagger.scopes.FragmentScope;
import com.example.structure.facade.Facade;
import com.example.structure.facade.FacadeImpl;
import com.example.structure.router.MainRouter;
import com.example.structure.router.impl.MainRouterImpl;
import com.example.ui.MyFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainActivityModule {
    @ActivityScope
    @Binds
    Facade facade(FacadeImpl facade);

    @ActivityScope
    @Binds
    MainRouter router(MainRouterImpl mainRouter);

    @FragmentScope
    @ContributesAndroidInjector(modules = {MyFragmentModule.class})
    MyFragment myFragment();
}
