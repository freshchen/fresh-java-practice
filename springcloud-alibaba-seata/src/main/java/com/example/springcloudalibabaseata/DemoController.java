package com.example.springcloudalibabaseata;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author darcy
 * @since 2020/8/12
 **/
@RestController
public class DemoController {

    @GetMapping("a")
    @GlobalTransactional
    public void a() {
        System.out.println(1);
    }
}
