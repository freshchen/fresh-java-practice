package com.ecnu.springbootwebsocket.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @anthor LingChen
 * @create 4/23/2019 4:38 PM
 * @Description
 */
@Component
public class ChatMessage {

    /**
     * 发送者
     */
    private String name;
    /**
     * 内容
     */
    private String content;
    /**
     * 接收者
     */
    private String receiver;
    /**
     * 时间
     */
    private String date;

    public ChatMessage(String name, String content, String receiver, String date) {
        this.name = name;
        this.content = content;
        this.receiver = receiver;
        this.date = date;
    }

    public ChatMessage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", receiver='" + receiver + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
