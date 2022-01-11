package com.atguigu.jdbctemplate.dao;

import com.atguigu.jdbctemplate.entity.Book;

import java.util.List;

/**
 * @author LYHstart
 * @create 2022-01-11 10:04
 */
public interface BookDao
{
    void addBook(Book book);

    void updateBook(Book book);

    void deleteBook(Book book);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchDeleteBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

}
