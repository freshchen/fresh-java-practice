package com.example.springcloudcontractconsumerrest.service;

import com.example.springcloudcontractconsumerrest.api.Callback;
import com.example.springcloudcontractconsumerrest.api.StockApi;
import com.example.springcloudcontractconsumerrest.dao.PersonRepository;
import com.example.springcloudcontractconsumerrest.model.Person;
import com.example.springcloudcontractconsumerrest.model.PersonDTO;
import com.example.springcloudcontractconsumerrest.model.Property;
import com.example.springcloudcontractconsumerrest.model.StockPriceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private StockApi stockApi;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonDTO getPersonById(Long id) {
        Person person = personRepository.getPersonById(id);
        Property property = person.getProperty();
        StockPriceDTO stockPriceDTO = null;
        Long money = null;
        try {
            stockPriceDTO = stockApi.getStockPrice(property.getStockId()).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (stockPriceDTO.getId().equals(property.getStockId())) {
            Long stockPrice = stockPriceDTO.getPrice();
            money = stockPrice * property.getStockCount() + property.getDeposit();
        }
        return new PersonDTO(person.getId(), person.getName(), money);


        //        PersonDTO personDTO = new PersonDTO(person.getId(), person.getName(), null);
//        stockApi.getStockPrice(property.getStockId())
//                .enqueue(new Callback.Builder<StockPriceDTO>()
//                        .onResponse((call, response) -> {
//                            if (response.isSuccessful()) {
//                                if (response.body().getId().equals(property.getStockId())) {
//                                    Long stockPrice = response.body().getPrice();
//                                    Long money = stockPrice * property.getStockCount() + property.getDeposit();
//                                    personDTO.setMoney(money);
//                                }
//
//                            }
//                        })
//                        .onFailure((stockPriceDTOCall, throwable) -> {
//                            // todo
//                        })
//                        .build());
//
//
//        return personDTO;
    }
}
