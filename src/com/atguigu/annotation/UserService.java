package com.atguigu.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author LYHstart
 * @create 2022-01-09 11:06
 *
 * 使用注解创建对象
 */
@Component(value = "userService")
public class UserService
{
    //属性注入
    //@Autowired                        //进行类型注入
    //@Qualifier(value = "userDao")     //进行名称注入
    @Resource(name = "userDao")         //可以进行类型注入、名称注入
    private UserDao dao;

    public void add()
    {
        System.out.println("service add....");
        dao.add();
    }
}
