package com.yuqi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages ={"com.yuqi.controller","com.yuqi.service"} )
@EnableJpaRepositories("com.yuqi.dao")
@EnableAutoConfiguration
@EntityScan("com.yuqi.entity")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}