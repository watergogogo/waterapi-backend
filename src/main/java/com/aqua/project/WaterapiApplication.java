package com.aqua.project;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.aqua.project.mapper")
@EnableDubbo
@SpringBootApplication
public class WaterapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterapiApplication.class, args);
    }

}
