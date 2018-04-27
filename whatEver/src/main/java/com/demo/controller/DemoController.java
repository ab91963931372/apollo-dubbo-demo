package com.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.service.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with IntelliJ IDEA
 * Create by tzh
 * Date: 2018/4/27
 * Time: 18:18
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Reference
    private Demo demo;

    @GetMapping("/test")
    public String testDubbo(){
        return demo.test();
    }
}
