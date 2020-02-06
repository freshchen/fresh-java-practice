package com.example.springcloudcontractrestprovider.controller;

import com.example.springcloudcontractrestprovider.dto.StockDTO;
import com.example.springcloudcontractrestprovider.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : freshchen
 * <P>Created on 2020-01-21 22:39 </p>
 **/
@RestController()
@RequestMapping("/stock")
public class StockRestController {

    @Autowired
    private StockService stockService;

    @GetMapping("/{id}")
    public StockDTO getStock(@PathVariable Long id) {
        return stockService.getStockById(id);
    }
}
