package com.atguigu.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * @author LYHstart
 * @create 2022-01-09 11:55
 *
 * 测试条件扫描
 */
@Repository
public class UserDao
{
    public void add()
    {
        System.out.println("dao add...");
    }

    public void update()
    {
        System.out.println("dao update....");
    }
}
