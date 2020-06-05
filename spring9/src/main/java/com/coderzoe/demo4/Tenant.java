package com.coderzoe.demo4;

/**
 * @author yhs
 * @date 2020/6/5 12:24
 * @description
 */
public class Tenant {
    public static void main(String[] args) {
        MyProxy myProxy = new MyProxy();
        myProxy.setRent(new Landlord());
        myProxy.rent();
    }
}
