package com.example.springcloudcontractconsumerrest.dao;

import com.example.springcloudcontractconsumerrest.model.Person;
import com.example.springcloudcontractconsumerrest.model.Property;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
    @Override
    public Person getPersonById(Long id) {
        return new Person(1L, "小张", new Property(600519, 1000L , 10000L));
    }
}
