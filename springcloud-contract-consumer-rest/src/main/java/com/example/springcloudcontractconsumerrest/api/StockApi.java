package com.example.springcloudcontractconsumerrest.api;

import com.example.springcloudcontractconsumerrest.model.StockPriceDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StockApi {

    @GET("/stock/price/{stockId}")
    Call<StockPriceDTO> getStockPrice(@Path(value = "stockId", encoded = true) Integer stockId);
}
