package com.spring.aop;

public class MoveApp {
    public static void main(String[] args) {
        Move t=new Tank();
        Move t1=new Car();
        Move moveproxy=new TankProxy(t);
        Move moveproxy1=new TankProxy(t1);
        moveproxy.move();
        moveproxy1.move();
    }
}
