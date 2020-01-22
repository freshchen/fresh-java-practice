package com.example.springcloudcontractconsumerrest.service;

import com.example.springcloudcontractconsumerrest.model.Person;
import com.example.springcloudcontractconsumerrest.model.PersonDTO;

public interface PersonService {

    PersonDTO getPersonById(Long id);
}
