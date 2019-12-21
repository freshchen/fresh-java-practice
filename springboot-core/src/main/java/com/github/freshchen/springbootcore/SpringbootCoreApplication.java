package com.github.freshchen.springbootcore;

import com.github.freshchen.springbootcore.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
public class SpringbootCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootCoreApplication.class, args);
        Person person = context.getBean("person", Person.class);
        person.order();
        ConcurrentHashMap
    }

    /**
     * 输出：
     * 你好，服务员
     * 可以给我一个汉堡包么？
     */

}
