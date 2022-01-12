package com.atguigu.jdbctemplate.transaction;

import com.atguigu.IOC.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LYHstart
 * @create 2022-01-12 10:24
 */
public class TestDao
{
    @Test
    public void test01()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        UserService us = context.getBean("userService", UserService.class);
        us.accountMoneySafe();
    }
}
