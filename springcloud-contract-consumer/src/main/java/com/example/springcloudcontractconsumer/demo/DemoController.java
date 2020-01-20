package com.example.springcloudcontractconsumer.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@RestController
public class DemoController {

    @GetMapping("/local/user")
    public User hello() throws IOException {
        DemoApi demoApi = new Retrofit.Builder()
                .baseUrl("http://127.0.0.1:8081")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(DemoApi.class);
        Call<User> hello = demoApi.user();
        Response<User> response = hello.execute();
        return response.body();
    }
}
