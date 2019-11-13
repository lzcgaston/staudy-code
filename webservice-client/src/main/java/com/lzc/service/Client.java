package com.lzc.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Create by Liu Zicheng at 2019/11/11 17:42
 */
public class Client {
    public static void main(String[] args) {
        //服务接口访问地址: http://localhost:8000/ws/hello

        //创建cxf代理工厂
        JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();

        //设置远程访问服务的地址
        bean.setAddress("http://localhost:8000/ws/hello");

        //设置接口类型
        bean.setServiceClass(HelloService.class);

        //对接口生成代理对象
        HelloService helloService = bean.create(HelloService.class);

        System.out.println(helloService.getClass());

        //远程访问服务端方法
        String result = helloService.sayHello("kathrine");

        System.out.println(result);


    }
}
