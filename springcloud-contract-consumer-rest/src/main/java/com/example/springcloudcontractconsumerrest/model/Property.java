package com.example.springcloudcontractconsumerrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Property {

    private Integer stockId;
    private Long stockCount;

    private Long deposit;
}
