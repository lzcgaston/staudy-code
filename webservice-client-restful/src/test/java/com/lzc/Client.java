package com.lzc;

import com.lzc.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

/**
 * Create by Liu Zicheng at 2019/11/13 13:32
 */
public class Client {

    @Test
    public void testSave() {

        User user = new User();
        user.setId(1);
        user.setUsername("bob");
        user.setCity("北京");
        //通过WebClient对象远程调用服务端
        WebClient
                .create("http://localhost:8001/ws/userService/user")
                .type(MediaType.APPLICATION_JSON) //指定请求的格式为json
                .post(user);
    }

    @Test
    public void testGet() {
        //通过WebClient对象远程调用服务端
        User user =
                WebClient
                        .create("http://localhost:8001/ws/userService/user/1")
                        .accept(MediaType.APPLICATION_JSON) //指定请求的格式为json
                        .get(User.class);
        System.out.println(user);
    }
}
