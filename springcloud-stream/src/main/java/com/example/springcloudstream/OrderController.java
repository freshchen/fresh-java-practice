package com.example.springcloudstream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.channel.BeanFactoryChannelResolver;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author darcy
 * @since 2020/05/30
 **/
@Slf4j
@RestController
public class OrderController {

    @Autowired
    private BeanFactoryChannelResolver resolver;

    @PostMapping("order")
    public String order(@RequestBody OrderForm orderForm) {
        log.info("Received Request " + orderForm);
        resolver.resolveDestination("inventory-in-0").send(new GenericMessage<>(orderForm));
        return "success";
    }
}
