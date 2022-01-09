package com.atguigu.testdemo;

import com.atguigu.bean.Emp;
import com.atguigu.collectiontype.Stu;
import com.atguigu.lifecycle.Order;
import com.atguigu.annotation.UserService;
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

    @Test   //测试Util提取注入
    public void test05()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.toString());
    }

    @Test   //测试工厂Bean -> 可以返回不同的Bean!
    public void test06()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Book book = context.getBean("myBean", Book.class);
        System.out.println(book.toString());
    }

    @Test   //测试单实例和多实例
    public void test07()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Book book1 = context.getBean("booksingleton", Book.class);
        Book book2 = context.getBean("booksingleton", Book.class);
        System.out.println(book1);
        System.out.println(book2);

        Book book3 = context.getBean("bookprototype", Book.class);
        Book book4 = context.getBean("bookprototype", Book.class);
        System.out.println(book3);
        System.out.println(book4);
    }

    @Test   //Bean生命周期探索
    public void test08()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Order order = context.getBean("lifecycle", Order.class);
        System.out.println("创建Bean的实例对象");
        System.out.println(order);
        //手动使得Bean实例销毁
        context.close();
    }

    @Test   //测试使用注解创建对象
    public void test09()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        UserService service = context.getBean("userService", UserService.class);
        service.add();
    }
}
