package com.coderzoe.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author yhs
 * @date 2020/6/6 23:56
 * @description
 */
@Component
@Aspect
public class MyAspect {
    @Before("execution(* com.coderzoe.service.MyService.service())")
    public void before(){
        System.out.println("方法执行前！");
    }
}
