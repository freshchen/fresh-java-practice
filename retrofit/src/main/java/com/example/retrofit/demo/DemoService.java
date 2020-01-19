package com.example.retrofit.demo;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface DemoService {

    @GET("user")
    Call<User> getUser();

    @POST("user")
    Call<Integer> addUser(@Body User user);



    static DemoService getInstance(){
        return new Retrofit.Builder().baseUrl("http://127.0.0.1:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(DemoService.class);
    }

}
