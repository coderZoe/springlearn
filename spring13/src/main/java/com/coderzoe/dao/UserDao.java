package com.coderzoe.dao;

import com.coderzoe.entity.User;

import java.util.List;

/**
 * @author yhs
 * @date 2020/6/7 10:28
 * @description
 */
public interface UserDao {
    List<User> getUsers();
}
