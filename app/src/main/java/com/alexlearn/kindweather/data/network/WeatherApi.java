package com.alexlearn.kindweather.data.network;

import com.alexlearn.kindweather.models.Data;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {

    @GET("weather")
    Flowable<Data> getWeatherData(@Query("q") String cityName,
                                  @Query("appid") String apiKey,
                                  @Query("units") String unites);

}
