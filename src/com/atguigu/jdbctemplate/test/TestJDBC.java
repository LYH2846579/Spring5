package com.atguigu.jdbctemplate.test;

import com.atguigu.jdbctemplate.entity.Book;
import com.atguigu.jdbctemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LYHstart
 * @create 2022-01-11 10:43
 */
public class TestJDBC
{
    @Test   //插入测试
    public void test01()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book("1","张三","九阴真经");
        bookService.addBook(book);
    }

    @Test   //更新测试
    public void test02()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book("0","李四","葵花宝典");
        bookService.updateBook(book);
    }

    @Test   //删除测试
    public void test03()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book("1","李四","葵花宝典");
        bookService.deleteBook(book);
    }

    @Test   //查询测试
    public void test04()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println("记录数目为:"+bookService.selectCount());
    }

    @Test   //查询测试
    public void test05()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findBookInfo("1"));
    }

    @Test   //测试查询集合
    public void test06()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> allBook = bookService.findAllBook();
        System.out.println(allBook);
    }

    @Test   //测试批量添加
    public void test07()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        /* 将需要添加进入的对象的属性通过Object数组的形式记载 */
        batchArgs.add(new Object[]{"3","java","tom"});
        batchArgs.add(new Object[]{"4","C++","jerry"});
        batchArgs.add(new Object[]{"5","MySQL","jack"});
        bookService.batchAddBook(batchArgs);
    }

    @Test   //测试批量删除
    public void test08()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        batchArgs.add(new Object[]{"3"});
        batchArgs.add(new Object[]{"4"});
        batchArgs.add(new Object[]{"5"});
        bookService.batchDeleteBook(batchArgs);
    }

    @Test   //测试批量修改
    public void test09()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        batchArgs.add(new Object[]{"张三丰","九阳神功","3"});
        batchArgs.add(new Object[]{"张无忌","如来神掌","4"});
        bookService.bachUpdateBook(batchArgs);
    }

}
