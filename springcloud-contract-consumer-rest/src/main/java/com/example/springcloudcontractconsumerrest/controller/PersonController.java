package com.example.springcloudcontractconsumerrest.controller;

import com.example.springcloudcontractconsumerrest.model.PersonDTO;
import com.example.springcloudcontractconsumerrest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public PersonDTO getPerson(@PathVariable Long id){
        return personService.getPersonById(id);
    }
}
