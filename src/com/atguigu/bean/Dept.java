package com.atguigu.bean;

/**
 * @author LYHstart
 * @create 2022-01-07 11:34
 *
 * 部门类
 */
public class Dept
{
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
