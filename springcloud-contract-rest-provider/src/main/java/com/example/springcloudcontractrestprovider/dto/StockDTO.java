package com.example.springcloudcontractrestprovider.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : freshchen
 * <P>Created on 2020-01-21 22:40 </p>
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDTO {

    private Long id;
    private String stockName;
    private Long stockMoney;
}
