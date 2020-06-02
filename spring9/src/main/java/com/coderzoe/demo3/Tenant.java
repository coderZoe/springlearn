package com.coderzoe.demo3;

import org.junit.Test;

/**
 * @data: 2020/06/01 22:08
 * @author: yhs
 * @description: 租客
 */
public class Tenant {

    @Test
    public void test1() {
        //真实角色
        Landlord landlord = new Landlord();
        //代理角色 动态生成生成代理类
        MyProxy myProxy = new MyProxy();
        myProxy.setRent(landlord);
        Rent proxy = (Rent) myProxy.getProxy();
        proxy.rent();
    }

    @Test
    public void test2(){
    }
}
