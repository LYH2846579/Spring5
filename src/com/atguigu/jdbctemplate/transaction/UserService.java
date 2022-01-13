package com.atguigu.jdbctemplate.transaction;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author LYHstart
 * @create 2022-01-12 9:37
 *
 * Service层
 */
@Service
public class UserService
{
    @Autowired
    private UserDao dao;

    //无事务处理
    public void accountmoney()
    {
        dao.reduceMoney();

        dao.addMoney();
    }

    //增加事务处理
    @Transactional
    public void accountMoneySafe()
    {
        dao.reduceMoney();
        //int i = 1 / 0;
        dao.addMoney();
    }
}
