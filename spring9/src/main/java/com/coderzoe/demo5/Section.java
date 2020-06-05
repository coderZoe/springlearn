package com.coderzoe.demo5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author yhs
 * @date 2020/6/5 15:54
 * @description 切面类 即我们的代理
 */
@Component
@Aspect
public class Section {

    @Before("execution(* com.coderzoe.demo5.Landlord.rent())")
    public void before(){
        System.out.println("带租客看房！！");
        System.out.println("谈价钱！！");
    }
    @After("execution(* com.coderzoe.demo5.Landlord.rent())")
    public void after(){
        System.out.println("交钥匙");
    }
}
