package com.example.swagger.controller;

import com.example.swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : freshchen
 * <P>Created on 2020-01-18 18:45 </p>
 **/
@RestController
@Api("案例")
public class DemoController {

    @GetMapping("/hello")
    @ApiOperation("打招呼")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/user")
    @ApiOperation("获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名"),
            @ApiImplicitParam(name = "age", value = "年龄")
    })
    public User user(String name, Integer age){
        return new User("wang");
    }
}
