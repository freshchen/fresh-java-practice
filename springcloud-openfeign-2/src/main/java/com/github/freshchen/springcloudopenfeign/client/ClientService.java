package com.github.freshchen.springcloudopenfeign.client;

import com.github.freshchen.springcloudopenfeign.controller.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author darcy
 * @since 2020/03/24
 **/
@Service
public class ClientService {

    @Autowired
    private IClient iClient;

    public String test(Form form){
        return iClient.test(form);
    }
}
