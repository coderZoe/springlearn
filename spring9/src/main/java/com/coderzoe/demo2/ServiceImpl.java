package com.coderzoe.demo2;

/**
 * @author yhs
 * @date 2020/6/1 22:27
 * @description
 */
public class ServiceImpl implements Service{
    public void add() {
        System.out.println("实现了增");
    }

    public void delete() {
        System.out.println("实现了删");
    }

    public void update() {
        System.out.println("实现了改");
    }

    public void query() {
        System.out.println("实现了查");
    }
}
