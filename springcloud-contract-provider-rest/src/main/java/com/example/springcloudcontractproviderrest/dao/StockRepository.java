package com.example.springcloudcontractproviderrest.dao;

import com.example.springcloudcontractproviderrest.model.StockDTO;

public interface StockRepository {

    StockDTO getStockById(Integer id);
}
