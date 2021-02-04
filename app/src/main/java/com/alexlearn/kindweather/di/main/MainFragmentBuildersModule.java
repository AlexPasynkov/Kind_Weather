package com.alexlearn.kindweather.di.main;

import com.alexlearn.kindweather.ui.fragments.home.HomeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract HomeFragment contributeHomeActivity();
}
