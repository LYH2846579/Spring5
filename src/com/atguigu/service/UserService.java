package com.atguigu.service;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.UserDaoImpl;

/**
 * @author LYHstart
 * @create 2022-01-07 11:03
 *
 * 测试注入外部Bean的类
 */
public class UserService
{
    private UserDao userDao;

    //使用set方法注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add()
    {
        System.out.println("add................");
        userDao.update();
    }
}
