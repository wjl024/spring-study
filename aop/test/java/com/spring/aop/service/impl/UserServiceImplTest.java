package com.spring.aop.service.impl;

import com.spring.aop.entity.User;
import com.spring.aop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/Spring.xml"})

public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void insertUser() {
        User user = new User();
        user.setAccount("test");
        user.setPassword("8888888");
        user.setCredits(999);
        int n = userService.insertUser(user);
        assertEquals(1, n);
    }

    @Test
    public void deleteUser() {
        int n = userService.deleteUser(2);
        assertEquals(0,n);
    }
    @Test
    public void updateUser() {
        User user = userService.getUser(2);
        user.setPassword("12345678");
        user.setCredits(1111111);
        int n = userService.updateUser(user);
        assertEquals(1, n);
    }

    @Test
    public void selectUsers() {
        List<User> users=userService.selectUsers();
        //使用lambda表达式输出集合的内容
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void getUser() {
        User user = userService.getUser(1);
        System.out.println(user);
    }

}