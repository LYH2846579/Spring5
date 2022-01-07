package com.atguigu.testdemo;

import com.atguigu.bean.Emp;
import com.atguigu.collectiontype.Stu;
import com.atguigu.service.UserService;
import com.atguigu.spring5.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LYHstart
 * @create 2022-01-07 11:16
 */
public class TestBean
{
    @Test   //对注入外部Bean进行测试
    public void test01()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test   //针对内部Bean的测试
    public void test02()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    @Test   //针对级联注入的测试
    public void test03()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println(emp1.toString());
    }

    @Test   //测试注入集合
    public void test04()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.output();
    }

    @Test
    public void test05()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.toString());
    }
}
