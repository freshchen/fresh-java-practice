package com.example.springbootsecurity.anthentication;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author darcy
 * @since 2020/06/28
 **/
public class MyAuthProvider extends DaoAuthenticationProvider {

    public MyAuthProvider(UserDetailsService userDetailsService) {
        super();
        this.setUserDetailsService(userDetailsService);
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        MyWebAuthDetailsSource.MyWebAuthDetails details = (MyWebAuthDetailsSource.MyWebAuthDetails) authentication.getDetails();
        System.out.println("MyAuthProvider " + details.getMethod());
        super.additionalAuthenticationChecks(userDetails, authentication);
    }
}
