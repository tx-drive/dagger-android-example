package com.example.dagger.modules;

import com.example.dagger.modules.main.MainActivityModule;
import com.example.dagger.scopes.ActivityScope;
import com.example.structure.repo.Repository;
import com.example.structure.repo.RepositoryImpl;
import com.example.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class})
public interface AppModule {
    @Singleton
    @Binds
    Repository repository(RepositoryImpl repository);

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    MainActivity mainActivityInjector();

}
