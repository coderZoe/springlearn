package com.coderzoe.dao;

import com.coderzoe.entity.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yhs
 * @date 2020/6/7 13:27
 * @description
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserDao{
    @Override
    public List<User> getUsers() {
        SqlSessionTemplate sqlSessionTemplate = getSqlSessionTemplate();
        UserDao mapper = sqlSessionTemplate.getMapper(UserDao.class);
        return mapper.getUsers();
    }
}
