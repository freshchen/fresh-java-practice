package com.github.freshchen.springbootcore.aop;

import org.springframework.stereotype.Component;

/**
 * @author freshchen
 */
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
