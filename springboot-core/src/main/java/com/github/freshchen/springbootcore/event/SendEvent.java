package com.github.freshchen.springbootcore.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author darcy
 * @since 2020/06/08
 **/
@Component
public class SendEvent {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void send(OrderEvent orderEvent) {
        publisher.publishEvent(orderEvent);
    }
}
