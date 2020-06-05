package com.coderzoe.demo4;

/**
 * @author yhs
 * @date 2020/6/5 12:23
 * @description
 */
public class MyProxy implements Rent{
    //被代理的实例
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public void rent() {
        System.out.println("中介带你看房子了！！");
        System.out.println("中介和你谈价格了！！");
        rent.rent();
        System.out.println("中介把钥匙交给你了！！");
    }
}
