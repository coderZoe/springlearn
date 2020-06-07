package com.coderzoe.dao;

import com.coderzoe.entity.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yhs
 * @date 2020/6/7 10:28
 * @description
 */
@Component
public class UserMapperImpl implements UserDao{


    /**
     * 由于我们之前已经在Spring的xml中注册了sqlSessionTemplate 所有这里直接拿过来用即可。
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<User> getUsers() {
        UserDao mapper = sqlSessionTemplate.getMapper(UserDao.class);
        return mapper.getUsers();
    }
}
