package com.example.springcloudstream;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
public class SpringcloudStreamApplication {

    public static void main(String[] args) {


        SpringApplication.run(SpringcloudStreamApplication.class, args);

    }

    @Bean
    public Function<Person, Person> get() {
        return person -> {
            System.out.println("get Received: " + person);
            person.setName(person.getName().toUpperCase());
            return person;
        };
    }

    @Bean
    public Consumer<Person> get2() {
        return person -> {
            System.out.println("get2 Received: " + person);
        };
    }

    @Data
    public static class Person {
        private String name;
    }

}
