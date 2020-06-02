package com.coderzoe.demo3;

/**
 * @data: 2020/06/01 22:06
 * @author: yhs
 * @description: 真实角色 被代理人
 */
public class Landlord implements Rent {

    public void rent() {
        System.out.println("房东出租房子");
    }
}
