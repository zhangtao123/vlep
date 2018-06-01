package com.anji.allways;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.anji.allways.dao")
@EnableTransactionManagement
@EnableDiscoveryClient
public class VlepBusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(VlepBusinessApplication.class, args);
    }
}