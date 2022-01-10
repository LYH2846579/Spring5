package com.atguigu.AOP;

/**
 * @author LYHstart
 * @create 2022-01-10 9:54
 *
 * 通过JDKProxy实现动态代理
 */
public interface UserDao
{
    public int add(int x,int y);

    public String update(String str);
}
