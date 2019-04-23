package com.ecnu.springbootwebsocket.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPObject;
import com.ecnu.springbootwebsocket.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;
import org.springframework.web.socket.handler.WebSocketHandlerDecorator;
import org.springframework.web.socket.handler.WebSocketHandlerDecoratorFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @anthor LingChen
 * @create 4/23/2019 1:58 PM
 * @Description
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    public Map usersMap = new ConcurrentHashMap();

    @Autowired
    private SimpMessagingTemplate template;

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
        registry.setUserDestinationPrefix("/user");
        registry.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("gs-guide-websocket").withSockJS();
    }

    @Override
    public void configureWebSocketTransport(WebSocketTransportRegistration registry) {
        registry.addDecoratorFactory(new WebSocketHandlerDecoratorFactory() {
            @Override
            public WebSocketHandler decorate(WebSocketHandler webSocketHandler) {
                return new WebSocketHandlerDecorator(webSocketHandler){
                    @Override
                    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
                        usersMap.put(session.getId(), session.getPrincipal().getName());
                        User user = new User();
                        user.setName(session.getPrincipal().getName());
                        user.setId(session.getId());
                        user.setOnline(true);
                        template.convertAndSend("/topic/userlist", JSON.toJSON(user));
                        System.out.println("连接成功："+session.getId());
                        super.afterConnectionEstablished(session);
                    }

                    @Override
                    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
                        usersMap.remove(session.getId());
                        User user = new User();
                        user.setName(session.getPrincipal().getName());
                        user.setId(session.getId());
                        user.setOnline(false);
                        template.convertAndSend("/topic/userlist", JSON.toJSON(user));
                        System.out.println("断开连接: " + session.getId());
                        super.afterConnectionClosed(session, closeStatus);
                    }
                };

            }

        });

    }
}
