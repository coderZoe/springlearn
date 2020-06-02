package com.coderzoe.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yhs
 * @date 2020/6/1 20:26
 * @description
 */

//Component注解 组件 相当于在xml中加了一个bean id
@Component
public class User {

    //@Value("yhs")
    //Spring的注解@Value 给属性赋值
    private String name;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    //@Value("yhs") 与在属性上注入一样
    public void setName(String name) {
        this.name = name;
    }


}
