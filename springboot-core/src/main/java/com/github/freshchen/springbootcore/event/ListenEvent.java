package com.github.freshchen.springbootcore.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author darcy
 * @since 2020/06/08
 **/
@Component
public class ListenEvent {

    @EventListener
    @Async
    public void id(OrderEvent orderEvent) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(orderEvent.getId());
    }

    @EventListener
    @Async
    public void money(OrderEvent orderEvent) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(orderEvent.getMoney());
    }
}
