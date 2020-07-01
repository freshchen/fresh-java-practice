package com.github.freshchen.springbootcore;

import com.github.freshchen.springbootcore.config.EnableMySelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author freshchen
 */
@SpringBootApplication
@EnableMySelector
public class SpringbootCoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootCoreApplication.class, args);
    }


}
