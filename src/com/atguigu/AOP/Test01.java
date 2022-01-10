package com.atguigu.AOP;

import com.atguigu.AOP.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LYHstart
 * @create 2022-01-10 11:07
 *
 * AOP测试
 */
public class Test01
{
    @Test   //测试使用注解配置spring的AOP操作
    public void test01()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
