package com.coderzoe.entity;

/**
 * @author yhs
 * @date 2020/5/31 10:36
 * @description
 */
public class Hello {
    private String name;

    public Hello() {
    }

    @Override
    public String toString() {
        return "Hello{" +
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
