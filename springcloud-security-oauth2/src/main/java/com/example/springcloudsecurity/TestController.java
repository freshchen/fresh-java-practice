package com.example.springcloudsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author darcy
 * @since 2020/06/15
 **/
@Controller
public class TestController {

    @GetMapping({"/", "/home"})
    public String home() {
        return "test";
    }
}
