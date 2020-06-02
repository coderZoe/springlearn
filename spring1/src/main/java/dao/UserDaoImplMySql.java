package dao;

/**
 * @author yhs
 * @date 2020/5/30 22:43
 * @description dao层impl方法实现dao层接口的具体方法
 */
public class UserDaoImplMySql implements UserDao{
    public void getUsers() {
        System.out.println("获得用户:MySql");
    }
}
