package com.coderzoe.aspect;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author yhs
 * @date 2020/6/6 15:09
 * @description
 */
@Component
public class AfterLog implements AfterReturningAdvice {

    /**
     * @param o       o
     * @param method  方法
     * @param objects 对象
     * @param o1      o1群
     * @data: 2020/06/06 15:10
     * @author: yhs
     * @return:
     * @description: Callback after a given method successfully returned.
     */
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回了"+o);
    }
}
