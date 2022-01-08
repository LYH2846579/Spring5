package com.atguigu.factoryBean;

import com.atguigu.spring5.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author LYHstart
 * @create 2022-01-08 10:11
 *
 * spring 中存在两种Bean的形式 -> 普通Bean和工厂Bean
 *
 * 以下为实现工厂Bean的案例
 */
public class MyBean implements FactoryBean<Book>
{

    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setBookName("abc");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
