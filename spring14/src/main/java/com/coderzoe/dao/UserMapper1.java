package com.coderzoe.dao;

import com.coderzoe.entity.User;

import java.util.List;

/**
 * @author yhs
 * @date 2020/6/7 14:36
 * @description
 */
public interface UserMapper1 {
    List<User> getUsers();

    void addUser(User user);

    void delete(long id);
}
