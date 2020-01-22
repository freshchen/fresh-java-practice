package com.example.springcloudcontractconsumerrest.config;

import com.example.springcloudcontractconsumerrest.api.StockApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfiguration {

    @Bean
    public StockApi stockApi() {
        return new Retrofit.Builder().baseUrl("http://127.0.0.1:8880")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(StockApi.class);
    }
}
