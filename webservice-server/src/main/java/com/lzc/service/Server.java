package com.lzc.service;

import com.lzc.service.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Create by Liu Zicheng at 2019/11/11 17:28
 */
public class Server {
    public static void main(String[] args) {
        //发布服务的工厂
        JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();

        //设置服务地址
        bean.setAddress("http://localhost:8000/ws/hello");

        //设置服务类
        bean.setServiceBean(new HelloServiceImpl());

        //添加日志输入,输出拦截器,观察soap请求和响应内容
        bean.getInInterceptors().add(new LoggingInInterceptor());
        bean.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        bean.create();
        System.out.println("发布服务成功,端口8000");

    }
}
