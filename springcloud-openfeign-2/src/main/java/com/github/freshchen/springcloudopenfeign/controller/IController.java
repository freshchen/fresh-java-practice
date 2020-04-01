package com.github.freshchen.springcloudopenfeign.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author darcy
 * @since 2020/03/24
 **/
@RestController
public interface IController {

    @PostMapping("/api/test")
    String test(@RequestBody Form form);
}
