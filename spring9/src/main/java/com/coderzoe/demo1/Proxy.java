package com.coderzoe.demo1;

import com.coderzoe.demo3.Rent;

/**
 * @data: 2020/06/01 22:09
 * @author: yhs
 * @description: 中介 代理角色
 */
public class Proxy implements Rent {
    private Rent landlord;

    public Proxy() {
    }

    public Proxy(Rent landlord) {
        this.landlord = landlord;
    }

    public void rent() {
        System.out.println("找到中介啦!!");
        seeHouse();
        landlord.rent();
        contract();
        fee();
    }

    public void seeHouse(){
        System.out.println("中介带你看房子啦！！");
    }

    public void fee(){
        System.out.println("中介收费啦！！");
    }

    public void contract(){
        System.out.println("中介签合同啦！！");
    }

    public Rent getLandlord() {
        return landlord;
    }

    public void setLandlord(Rent landlord) {
        this.landlord = landlord;
    }
}
