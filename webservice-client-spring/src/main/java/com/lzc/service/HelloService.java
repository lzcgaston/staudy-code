package com.lzc.service;

import javax.jws.WebService;

/**
 * Create by Liu Zicheng at 2019/11/11 17:24
 */
@WebService
public interface HelloService {
    /*
    对外发布服务接口的方法
     */
    public String sayHello(String name);
}
