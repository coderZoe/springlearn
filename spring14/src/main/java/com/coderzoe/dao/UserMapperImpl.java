package com.coderzoe.dao;

import com.coderzoe.entity.User;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yhs
 * @date 2020/6/7 14:42
 * @description
 */
@Component
public class UserMapperImpl implements UserMapper1 {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<User> getUsers() {
        UserMapper1 mapper = sqlSessionTemplate.getMapper(UserMapper1.class);
        mapper.addUser(new User(100L,"Spring","SpringNb"));
        mapper.delete(100L);
        return mapper.getUsers();
    }

    @Override
    public void addUser(User user) {
        UserMapper1 mapper1 = sqlSessionTemplate.getMapper(UserMapper1.class);
        mapper1.addUser(user);
    }

    @Override
    public void delete(long id) {
        UserMapper1 userMapper1 = sqlSessionTemplate.getMapper(UserMapper1.class);
        userMapper1.delete(id);
    }

}
