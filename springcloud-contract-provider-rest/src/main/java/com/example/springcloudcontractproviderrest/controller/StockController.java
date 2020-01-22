package com.example.springcloudcontractproviderrest.controller;

import com.example.springcloudcontractproviderrest.model.StockDTO;
import com.example.springcloudcontractproviderrest.model.StockPriceDTO;
import com.example.springcloudcontractproviderrest.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenling
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    StockService stockService;

    @GetMapping("/price/{id}")
    public StockPriceDTO getStockPrice(@PathVariable Integer id){
        return stockService.getStockPrice(id);
    }
}
