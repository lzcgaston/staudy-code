package com.lzc.service.impl;

import com.lzc.service.HelloService;

/**
 * Create by Liu Zicheng at 2019/11/11 17:27
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name +",helloService!";
    }
}
