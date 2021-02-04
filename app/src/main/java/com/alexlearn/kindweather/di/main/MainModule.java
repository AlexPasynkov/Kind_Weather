package com.alexlearn.kindweather.di.main;

import com.alexlearn.kindweather.data.network.WeatherApi;

import javax.inject.Singleton;

import dagger.Provides;
import retrofit2.Retrofit;

public class MainModule {

    @Singleton
    @MainScope
    static WeatherApi providesApiService(Retrofit retrofit){
        return retrofit.create(WeatherApi.class);
    }
}
