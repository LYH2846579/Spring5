package com.atguigu.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LYHstart
 * @create 2022-01-06 10:30
 */
public class TestSpring5
{
    @Test
    public void testAdd()
    {
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }


    @Test   //测试使用spring创建对象
    public void test01()
    {
        BeanFactory bf = new ClassPathXmlApplicationContext("bean1.xml");
        User user = bf.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test   //测试使用set方法实现属性的注入
    public void test02()
    {
        //默认将bean2.xml放置在src包下
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);

    }

    @Test   //测试使用有参构造的方式进行属性注入
    public void test03()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.output();
    }

    @Test   //测试null值注入 booknull
    public void test04()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Object booknull = context.getBean("booknull");
        System.out.println(booknull);
    }

    @Test
    public void test05()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Object bookspecial = context.getBean("bookspecial");
        System.out.println(bookspecial);
    }
}
