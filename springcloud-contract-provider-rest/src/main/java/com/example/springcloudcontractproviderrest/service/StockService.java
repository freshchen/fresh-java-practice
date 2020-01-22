package com.example.springcloudcontractproviderrest.service;

import com.example.springcloudcontractproviderrest.model.StockDTO;
import com.example.springcloudcontractproviderrest.model.StockPriceDTO;

public interface StockService {

    StockPriceDTO getStockPrice(Integer id);
}
