package com.example.springcloudcontractconsumer.demo;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface DemoApi {

    @GET("/user")
    Call<User> user();

}
