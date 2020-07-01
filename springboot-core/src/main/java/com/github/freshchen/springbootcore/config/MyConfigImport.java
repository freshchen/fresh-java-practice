package com.github.freshchen.springbootcore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author darcy
 * @since 2020/06/29
 **/
@Import({MyBean.class, OtherBean.class})
@Configuration
public class MyConfigImport {
}
