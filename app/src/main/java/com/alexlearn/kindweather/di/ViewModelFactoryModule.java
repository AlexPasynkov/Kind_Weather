package com.alexlearn.kindweather.di;

import androidx.lifecycle.ViewModelProvider;

import com.alexlearn.kindweather.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);

//    @Binds
//    @IntoMap
//    @ViewModelKey(MainActivityViewModel.class)
//    public abstract ViewModel bindMainActivityViewModel(MainActivityViewModel mainActivityViewModel);
}
