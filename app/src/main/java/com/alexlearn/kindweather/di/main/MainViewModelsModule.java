package com.alexlearn.kindweather.di.main;

import androidx.lifecycle.ViewModel;

import com.alexlearn.kindweather.di.ViewModelKey;
import com.alexlearn.kindweather.ui.fragments.home.HomeViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    public abstract ViewModel bindViewModel(HomeViewModel homeViewModel);
}
