package com.atguigu.jdbctemplate.service;

import com.atguigu.jdbctemplate.dao.BookDao;
import com.atguigu.jdbctemplate.dao.BookDaoImpl;
import com.atguigu.jdbctemplate.entity.Book;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

/**
 * @author LYHstart
 * @create 2022-01-11 10:02
 */
@Service
public class BookService
{
    /* 将Dao注入到service之中 */
    @Autowired
    private BookDao bookDao;

    //添加方法
    public void addBook(Book book)
    {
        bookDao.addBook(book);
    }

    //修改
    public void updateBook(Book book)
    {
        bookDao.updateBook(book);
    }

    //删除数据
    public void deleteBook(Book book)
    {
        bookDao.deleteBook(book);
    }

    //查询总记录数目
    public int selectCount()
    {
        return bookDao.selectCount();
    }

    //查询一个图书信息
    public Book findBookInfo(String id)
    {
        return bookDao.findBookInfo(id);
    }

    //查询一个集合
    public List<Book> findAllBook()
    {
        return bookDao.findAllBook();
    }

    //批量添加
    public void batchAddBook(List<Object[]> batchArgs)
    {
        bookDao.batchAddBook(batchArgs);
    }

    //批量删除
    public void batchDeleteBook(List<Object[]> batchArgs)
    {
        bookDao.batchDeleteBook(batchArgs);
    }

    //批量修改
    public void bachUpdateBook(List<Object[]> batchArgs) {
        bookDao.batchUpdateBook(batchArgs);
    }
}
