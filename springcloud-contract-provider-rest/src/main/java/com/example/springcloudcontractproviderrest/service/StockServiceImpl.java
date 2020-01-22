package com.example.springcloudcontractproviderrest.service;

import com.example.springcloudcontractproviderrest.dao.StockRepository;
import com.example.springcloudcontractproviderrest.model.StockDTO;
import com.example.springcloudcontractproviderrest.model.StockPriceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public StockPriceDTO getStockPrice(Integer id) {
        StockDTO stockPriceDTO = stockRepository.getStockById(id);
        return new StockPriceDTO(stockPriceDTO.getId(), stockPriceDTO.getPrice());
    }
}
