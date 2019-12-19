package service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.dsl.service.mappers")
public class DslServiceTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DslServiceTestApplication.class, args);
    }
}
