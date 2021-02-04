package com.alexlearn.kindweather.di;

import com.alexlearn.kindweather.ui.activities.MainActivity;
import com.alexlearn.kindweather.ui.fragments.home.HomeViewModel;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();


}
