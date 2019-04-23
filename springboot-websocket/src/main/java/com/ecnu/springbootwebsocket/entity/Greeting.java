package com.ecnu.springbootwebsocket.entity;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 20:59
 * @Author: Ling Chen
 * @Description:
 */
public class Greeting {

    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
