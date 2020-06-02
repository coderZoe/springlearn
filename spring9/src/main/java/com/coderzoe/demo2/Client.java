package com.coderzoe.demo2;

import org.junit.Test;

/**
 * @author yhs
 * @date 2020/6/1 22:28
 * @description
 */
public class Client {
    @Test
    public void test(){
        Service service = new ServiceImpl();
        service.add();
    }

    @Test
    public void test1(){
        ServiceImplProxy serviceImplProxy = new ServiceImplProxy(new ServiceImpl());
        serviceImplProxy.add();
        serviceImplProxy.query();
    }
}
