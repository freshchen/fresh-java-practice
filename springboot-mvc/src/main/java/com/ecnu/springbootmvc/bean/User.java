package com.ecnu.springbootmvc.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @anthor LingChen
 * @create 4/18/2019 4:13 PM
 * @Description
 */
@Component
public class User implements Serializable {

    private int age;
    private String name;
    private String city;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
