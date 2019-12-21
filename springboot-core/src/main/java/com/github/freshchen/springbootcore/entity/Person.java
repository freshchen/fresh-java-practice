package com.github.freshchen.springbootcore.entity;

import com.github.freshchen.springbootcore.annotation.Chinese;
import com.github.freshchen.springbootcore.annotation.Hello;
import com.github.freshchen.springbootcore.service.Action;
import org.springframework.stereotype.Component;

@Component
public class Person implements Action {

    @Chinese
    private String name;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    @Hello("服务员")
    public void order() {
        System.out.println("可以给我一个汉堡包么？");
    }

}
