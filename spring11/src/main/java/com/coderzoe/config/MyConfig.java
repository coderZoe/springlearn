package com.coderzoe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yhs
 * @date 2020/6/7 0:10
 * @description
 */

@Configuration
//允许使用切面代理
@EnableAspectJAutoProxy
@ComponentScan("com.coderzoe")
public class MyConfig {
}
