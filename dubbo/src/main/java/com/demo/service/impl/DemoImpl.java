package com.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.service.Demo;

/**
 * Create with IntelliJ IDEA
 * Create by tzh
 * Date: 2018/4/27
 * Time: 1:01
 */
@Service
public class DemoImpl implements Demo{

    @Override
    public String test(){
        return "success";
    }
}
