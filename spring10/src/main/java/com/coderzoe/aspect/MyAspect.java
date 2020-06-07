package com.coderzoe.aspect;

import org.springframework.stereotype.Component;

/**
 * @author yhs
 * @date 2020/6/6 23:23
 * @description 不再关联Spring的接口，自定义一个切面
 */

@Component
public class MyAspect {
    public void before(){
        System.out.println("方法执行前");
    }
    public void after(){
        System.out.println("方法执行后");
    }
}
