package com.example.springcloudcontractproviderrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenling
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDTO {

    private Integer id;
    private String name;
    private Long price;
    private String exchange;
}
