package com.example.springcloudstream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author darcy
 * @since 2020/05/30
 **/

@Configuration
@Slf4j
public class MessageQueueConfig {

    @Bean
    public Function<OrderForm, OrderForm> inventory() {
        return orderForm -> {
            log.info("Inventory Received Message: " + orderForm);
            return orderForm;
        };
    }

    @Bean
    public Consumer<OrderForm> report() {
        return orderForm -> {
            log.info("Report Received Message: " + orderForm);
        };
    }
}
