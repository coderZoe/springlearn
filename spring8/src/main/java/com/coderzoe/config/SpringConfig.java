package com.coderzoe.config;

import com.coderzoe.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yhs
 * @date 2020/6/1 21:05
 * @description
 */

@Configuration
@ComponentScan("com.coderzoe")
//与xml import一样
@Import(SpringConfig2.class)
public class SpringConfig {

    /**
     * @data: 2020/06/01 21:17
     * @author: yhs
     * @return: {@link User }
     * @description: 注册一个bean与之前xml中写一个<bean></bean>一样
     *              方法名与bean id对应 class与方法返回值相同
     */
    @Bean
    public User getUser(){
        return new User();  //返回要注入到bean的对象 可以自定义new 对象
    }
}
