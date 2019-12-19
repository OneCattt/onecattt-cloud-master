package com.dsl.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableEurekaClient
@MapperScan("com.dsl.service.mappers")
public class DslServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DslServiceUserApplication.class, args);
    }
}
