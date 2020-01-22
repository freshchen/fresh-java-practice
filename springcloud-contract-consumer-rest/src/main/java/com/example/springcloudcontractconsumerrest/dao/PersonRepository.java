package com.example.springcloudcontractconsumerrest.dao;

import com.example.springcloudcontractconsumerrest.model.Person;

public interface PersonRepository {

    Person getPersonById(Long id);
}
