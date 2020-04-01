package com.github.freshchen.springcloudopenfeign.controller;

import org.springframework.stereotype.Component;

import javax.validation.Valid;

/**
 * @author darcy
 * @since 2020/03/24
 **/
@Component
public class ControllerImpl implements IController {
    @Override
    public String test(@Valid Form form, String token) {
        System.out.println(token);
        return "success";
    }
}
