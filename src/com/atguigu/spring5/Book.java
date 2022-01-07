package com.atguigu.spring5;

import java.util.List;

/**
 * @author LYHstart
 * @create 2022-01-06 15:28
 *
 * 用于测试spring对象属性注入的类
 */
public class Book
{
    private String bookName;
    private String bookAuther;
    private List list;

    public void setList(List list) {
        this.list = list;
    }

    //1.使用set方法进行注入
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setBookAuther(String bookAuther) {
        this.bookAuther = bookAuther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuther='" + bookAuther + '\'' +
                ", list=" + list +
                '}';
    }
}
