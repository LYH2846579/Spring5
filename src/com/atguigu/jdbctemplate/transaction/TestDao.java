package com.atguigu.jdbctemplate.transaction;

import com.atguigu.IOC.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LYHstart
 * @create 2022-01-12 10:24
 */
public class TestDao
{
    @Test   //使用xml配置
    public void test01()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        UserService us = context.getBean("userService", UserService.class);
        us.accountMoneySafe();
    }

    @Test   //完全注解开发
    public void test02()
    {
        //与XML配置的时候有一定的不同！
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService us = context.getBean("userService", UserService.class);
        us.accountMoneySafe();
    }
}
