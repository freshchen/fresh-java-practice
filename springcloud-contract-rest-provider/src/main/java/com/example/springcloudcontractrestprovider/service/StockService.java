package com.example.springcloudcontractrestprovider.service;

import com.example.springcloudcontractrestprovider.dto.StockDTO;

/**
 * @author : freshchen
 * <P>Created on 2020-01-21 22:41 </p>
 **/
public interface StockService {

    StockDTO getStockById(Long id);
}
