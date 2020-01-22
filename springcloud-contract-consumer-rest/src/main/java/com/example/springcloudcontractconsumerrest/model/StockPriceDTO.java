package com.example.springcloudcontractconsumerrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenling
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockPriceDTO {

    private Integer id;
    private Long price;
}
