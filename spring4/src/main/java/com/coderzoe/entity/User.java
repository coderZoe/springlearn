package com.coderzoe.entity;

/**
 * @author yhs
 * @date 2020/5/31 11:53
 * @description
 */
public class User {
    private String name;

    public User() {
        System.out.println("进入User类的无参构造");
    }


    public User(String name) {
        System.out.println("进入User类的有参构造");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("进入User的set方法");
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
