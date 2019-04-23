package com.ecnu.springbootwebsocket.entity;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 20:58
 * @Author: Ling Chen
 * @Description:
 */
public class HelloMessage {

    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
