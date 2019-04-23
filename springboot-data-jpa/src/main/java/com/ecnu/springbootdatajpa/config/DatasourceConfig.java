package com.ecnu.springbootdatajpa.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/23 21:29
 * @Author: Ling Chen
 * @Description:
 */
@Configuration
public class DatasourceConfig {

    @Autowired
    HikariDataSource dataSource;

    @Bean
    public DataSource dataSource(Environment env){
        dataSource.setJdbcUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        return dataSource;
    }
}
