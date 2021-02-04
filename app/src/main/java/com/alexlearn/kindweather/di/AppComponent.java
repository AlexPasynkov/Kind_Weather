package com.alexlearn.kindweather.di;

import android.app.Application;

import com.alexlearn.kindweather.BaseApplication;
import com.alexlearn.kindweather.di.main.MainFragmentBuildersModule;
import com.alexlearn.kindweather.di.main.MainViewModelsModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
                MainViewModelsModule.class,
                MainFragmentBuildersModule.class
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
