package com.github.freshchen.springbootcore.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @author darcy
 * @since 2020/06/08
 **/
@Setter
@Getter
public class OrderEvent extends ApplicationEvent {

    private Integer id;
    private Long money;

    public OrderEvent(Object source) {
        super(source);
    }
}
