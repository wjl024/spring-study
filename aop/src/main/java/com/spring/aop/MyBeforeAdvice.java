package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户自定义的前置增强类
 */
public class MyBeforeAdvice {
    private static final Logger logger= LoggerFactory.getLogger("Hello.class");
//    定义前置方法
    public void beforeMethod(){
        logger.info("错误");
        System.out.println("this is a before method");
    }
}
