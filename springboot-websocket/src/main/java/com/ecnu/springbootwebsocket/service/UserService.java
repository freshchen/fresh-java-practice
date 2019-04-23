package com.ecnu.springbootwebsocket.service;

import com.ecnu.springbootwebsocket.config.WebSocketConfig;
import com.ecnu.springbootwebsocket.entity.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @anthor LingChen
 * @create 4/23/2019 5:42 PM
 * @Description
 */
@Service
public class UserService implements UserDetailsService {
    @Autowired
    WebSocketConfig webSocketConfig;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String onlinuser = webSocketConfig.usersMap.toString();
        if (onlinuser.contains(username)||"robot".equals(username)) {
            throw new UsernameNotFoundException("用户已存在");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("USER"));
        UserPrincipal user = new UserPrincipal(username,"",authorities);
        user.setName(username);
        return user;
    }
}
