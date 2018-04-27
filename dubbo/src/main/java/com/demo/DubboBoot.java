package com.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Create with IntelliJ IDEA
 * Date: 2018/4/27
 * Time: 0:42
 */
@ComponentScan("com.demo")
@EnableApolloConfig
@SpringBootApplication
public class DubboBoot {
    public static void main(String[] args) {
        SpringApplication.run(DubboBoot.class,args);
    }
}
