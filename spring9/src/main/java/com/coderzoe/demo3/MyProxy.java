package com.coderzoe.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yhs
 * @date 2020/6/2 20:55
 * @description 用于自动生成代理类
 */
public class MyProxy implements InvocationHandler {

    //被代理的实例
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    /**
     * @param proxy  代理
     * @param method 方法
     * @param args   arg游戏
     * @data: 2020/06/02 20:56
     * @author: yhs
     * @return: {@link Object }
     * @description: 处理代理实例 并返回结果
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("中介带看房!!");
        System.out.println("收中介费!");
        return method.invoke(rent, args);
    }
}
