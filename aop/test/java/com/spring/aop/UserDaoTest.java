package com.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路径
@ContextConfiguration(locations={"/Spring.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao user;
    @Test
    public void test() {
        user.insert();
    }
}