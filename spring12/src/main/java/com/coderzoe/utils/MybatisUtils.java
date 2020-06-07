package com.coderzoe.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yhs
 * @date 2020/6/7 9:31
 * @description
 */
public class MybatisUtils {
    private static ThreadLocal<SqlSession> sessionThreadLocal = new ThreadLocal<>();
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private MybatisUtils() {
    }

    public static SqlSession getSqlSession(){
        SqlSession sqlSession = sessionThreadLocal.get();
        if(sqlSession==null){
            sqlSession = sqlSessionFactory.openSession();
            //设置事务自动提交 默认是false
//            sqlSession = sqlSessionFactory.openSession(true);
        }
        return sqlSession;
    }

    public static void closeSqlSession(){
        SqlSession sqlSession = sessionThreadLocal.get();
        if(sqlSession!=null){
            sqlSession.close();
            sessionThreadLocal.remove();
        }
    }
}
