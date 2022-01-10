package com.atguigu.AOP;

/**
 * @author LYHstart
 * @create 2022-01-10 9:56
 *
 * UserDao的实现类
 */
public class UserDaoImpl implements UserDao
{
    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public String update(String str) {
        return str;
    }
}
