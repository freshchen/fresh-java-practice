package com.example.springcloudcontractproviderrest.dao;

import com.example.springcloudcontractproviderrest.model.StockDTO;
import org.springframework.stereotype.Repository;

@Repository
public class StockRepositoryImpl implements StockRepository {
    @Override
    public StockDTO getStockById(Integer id) {
        return new StockDTO(600519, "贵州茅台", 9999L, "SH");
    }
}
