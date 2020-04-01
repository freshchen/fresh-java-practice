package com.github.freshchen.springcloudopenfeign;

import com.github.freshchen.springcloudopenfeign.client.ClientService;
import com.github.freshchen.springcloudopenfeign.controller.Form;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class SpringcloudOpenfeignApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringcloudOpenfeignApplication.class, args);
        ClientService bean = run.getBean(ClientService.class);
        Form form = new Form();
        form.setName("22222222");
        String sadasdasdas = bean.test(form);
        System.out.println(sadasdasdas);
    }

}
