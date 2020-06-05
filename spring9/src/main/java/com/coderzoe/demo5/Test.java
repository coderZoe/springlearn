package com.coderzoe.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yhs
 * @date 2020/6/5 16:04
 * @description
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Landlord landlord = context.getBean("landlord", Landlord.class);
        landlord.rent();
    }
}
