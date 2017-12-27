package com.example.boottest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.boottest.dao")
public class BoottestApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoottestApplication.class, args);
    }
}