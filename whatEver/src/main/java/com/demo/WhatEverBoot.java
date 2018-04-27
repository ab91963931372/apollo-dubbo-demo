package com.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Create with IntelliJ IDEA
 * Create by tzh
 * Date: 2018/4/27
 * Time: 18:15
 */
@ComponentScan("com.demo")
@EnableApolloConfig
@SpringBootApplication
public class WhatEverBoot {
    public static void main(String[] args) {
        SpringApplication.run(WhatEverBoot.class, args);
    }
}
