package com.atguigu.IOC.dao;

/**
 * @author LYHstart
 * @create 2022-01-07 11:06
 *
 * 测试注入外部Bean
 */
public class UserDaoImpl implements UserDao
{
    public UserDaoImpl() {
        System.out.println("UserDaoImpl被创建....");
    }

    @Override
    public void update() {
        System.out.println("update.....");
    }
}
