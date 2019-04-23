package com.ecnu.springbootwebsocket.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @anthor LingChen
 * @create 4/23/2019 4:25 PM
 * @Description
 */
@Component
public class User {

    private String name;
    private String id;
    private boolean online;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", online=" + online +
                '}';
    }
}
