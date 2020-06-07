package com.coderzoe.aspect;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author yhs
 * @date 2020/6/6 15:04
 * @description 这里通过关联MethodBeforeAdvice接口实现切面切入
 */
@Component
public class BeforeLog implements MethodBeforeAdvice {

    /**
     * @param method  方法 要执行目标对象的方法
     * @param objects 对象 参数
     * @param o       o 目标
     * @data: 2020/06/06 15:07
     * @author: yhs
     * @return:
     * @description:
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
