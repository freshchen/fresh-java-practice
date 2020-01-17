package com.example.springbootjooq.demo;

import com.example.springbootjooq.generated.tables.pojos.User;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenling
 */
@RestController
@RequestMapping("/demo/")
public class DemoController {

    @Autowired
    private DemoService service;

    @RequestMapping("/insert/user/{name}/{age}")
    public void insert(@PathVariable String age, @PathVariable String name){
        service.insert(new User().setAge(age).setName(name));
    }

    @RequestMapping("/update/user/{name}/{age}")
    public void update(@PathVariable String age, @PathVariable String name){
        service.update(new User().setAge(age).setName(name));
    }

    @RequestMapping("/delete/user/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }

    @GetMapping("/select/user/{id}")
    public User selectByID(@PathVariable Integer id){
        return service.selectById(id);
    }
}
