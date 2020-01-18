package com.example.swagger.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : freshchen
 * <P>Created on 2020-01-18 18:53 </p>
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket clinicDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("clinic");
    }

    @Bean
    public Docket defaultDocket(Environment env) {
        boolean flag = env.acceptsProfiles(Profiles.of("dev", "test"));
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(flag)
                .groupName("default")
                .apiInfo(new ApiInfoBuilder().title("Demo").contact(new Contact("freshchen", "***", "***")).description("Have a nice day!").version("1.0").build())
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error.*")))//错误路径不监控
                .paths(PathSelectors.regex("/.*"))// 对根下所有路径进行监控
                .build();
    }
}
