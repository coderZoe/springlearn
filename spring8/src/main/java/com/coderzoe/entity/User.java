package com.coderzoe.entity;

import org.springframework.stereotype.Component;

/**
 * @author yhs
 * @date 2020/6/1 20:26
 * @description
 */

@Component
public class User {

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

    public void setName(String name) {
        this.name = name;
    }


}
