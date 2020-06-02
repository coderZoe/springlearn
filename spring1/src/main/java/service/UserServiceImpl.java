package service;

import dao.UserDao;
import dao.UserDaoImplMySql;

/**
 * @author yhs
 * @date 2020/5/30 22:46
 * @description Sevice层做业务处理 并调用dao层的方法
 */
public class UserServiceImpl implements UserService{
    UserDao userDao = new UserDaoImplMySql();
    public void getUsers() {
        userDao.getUsers();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
