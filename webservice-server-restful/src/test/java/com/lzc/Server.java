package com.lzc;

import com.lzc.service.UserviceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Create by Liu Zicheng at 2019/11/13 11:48
 */
public class Server {
    public static void main(String[] args) {
        //创建发布服务的工厂
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

        //设置访问服务的地址
        factory.setAddress("http://localhost:8001/ws/");

        //设置服务类
        factory.setServiceBean(new UserviceImpl());

        //添加日志输入输出拦截器
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        factory.create();

        System.out.println("发布服务成功, 端口8001");
    }
}
