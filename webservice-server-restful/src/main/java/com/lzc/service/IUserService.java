package com.lzc.service;

import com.lzc.entity.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * Create by Liu Zicheng at 2019/11/13 11:03
 * @Path("/userService") 访问当前服务接口对应的路径 /userService
 */
@Path("/userService")
//服务器支持的返回数据类型 在方法上指定类型后会覆盖此处
@Produces("*/*")
public interface IUserService {

    //处理请求的类型. post对应insert插入操作
    @POST
    //同上@Path("/userService") /userService/user
    @Path("/user")
    //服务器支持的请求数据格式类型
    @Consumes({"application/xml","application/json"})
    public void saveUser(User user);

    //处理请求的类型. put对应update修改操作
    @PUT
    //同上@Path("/userService") /userService/user
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void updateUser(User user);

    //处理请求的类型. get对应select查询操作
//    @GET
    //同上@Path("/userService") /userService/user
    @Path("/user/123")
    //服务器支持的返回数据类型
    @Produces({"application/xml","application/json"})
    public List<User> findAllUser();
    //处理请求的类型. get对应select查询操作
    @GET
    //同上@Path("/userService") /userService/user
    @Path("/user/{id}")
    @Consumes("application/xml")
    @Produces({"application/xml","application/json"})
    public User findUserById(@PathParam("id") Integer id);

    //处理请求的类型. delete对应delete删除操作
    @DELETE
    //同上@Path("/userService") /userService/user
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    public void deleteUser(@PathParam("id") Integer id);
}
