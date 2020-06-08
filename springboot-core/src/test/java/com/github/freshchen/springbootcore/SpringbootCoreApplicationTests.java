package com.github.freshchen.springbootcore;

import com.github.freshchen.springbootcore.aop.Person;
import com.github.freshchen.springbootcore.event.OrderEvent;
import com.github.freshchen.springbootcore.event.SendEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootCoreApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private SendEvent sendEvent;

    @Test
    void order() {
        person.order();
    }


    @Test
    void event() {
        OrderEvent orderEvent = new OrderEvent(this);
        orderEvent.setId(1);
        orderEvent.setMoney(100L);
        System.out.println("start");
        sendEvent.send(orderEvent);
        System.out.println("end");
    }

    @Test
    void contextLoads() {
    }

}
