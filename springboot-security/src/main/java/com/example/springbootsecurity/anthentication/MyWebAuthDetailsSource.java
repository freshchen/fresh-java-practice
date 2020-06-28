package com.example.springbootsecurity.anthentication;

import lombok.Getter;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author darcy
 * @since 2020/06/28
 **/
@Service
public class MyWebAuthDetailsSource extends WebAuthenticationDetailsSource {

    @Override
    public WebAuthenticationDetails buildDetails(HttpServletRequest context) {
        return new MyWebAuthDetails(context);
    }

    @Getter
    public static class MyWebAuthDetails extends WebAuthenticationDetails {

        private final String method;

        /**
         * Records the remote address and will also set the session Id if a session already
         * exists (it won't create one) and will also set the http method
         *
         * @param request that the authentication request was received from
         */
        public MyWebAuthDetails(HttpServletRequest request) {
            super(request);
            this.method = request.getMethod();
            System.out.println("MyWebAuthDetails");
        }
    }
}
