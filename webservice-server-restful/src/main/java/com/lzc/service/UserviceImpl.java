package com.lzc.service;

import com.lzc.IUserService;
import com.lzc.entity.Car;
import com.lzc.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by Liu Zicheng at 2019/11/13 11:04
 */
public class UserviceImpl implements IUserService {
    @Override
    public void saveUser(User user) {
        System.out.println("save user" + user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user" + user);
    }

    @Override
    public List<User> findAllUser() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setUsername("tony");
        user.setCity("北京");
        List<Car> cars = new ArrayList<>();
        Car car = new Car();
        car.setId(101);
        car.setCarName("劳斯莱斯");
        car.setPrice(1000000d);
        cars.add(car);
        user.setCars(cars);
        users.add(user);
        return users;
    }

    @Override
    public User findUserById(Integer id) {
        if (id == 1) {
            List<Car> cars = new ArrayList<>();
            Car car = new Car();
            car.setId(102);
            car.setCarName("奔驰");
            car.setPrice(990000d);
            cars.add(car);
            User user = new User(1, "jack", "南京", cars);
            return user;
        }
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("delete user id" + id);
    }
}
