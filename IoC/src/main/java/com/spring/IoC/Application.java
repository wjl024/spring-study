package com.spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        MessagePrinter messagePrinter=context.getBean(MessagePrinter.class);
        messagePrinter.printMessage();
    }
}
