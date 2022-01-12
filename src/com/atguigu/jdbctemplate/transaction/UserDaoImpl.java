package com.atguigu.jdbctemplate.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author LYHstart
 * @create 2022-01-12 9:38
 */
@Component
public class UserDaoImpl implements UserDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where id=?;";
        jdbcTemplate.update(sql,100,1);
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where id=?;";
        jdbcTemplate.update(sql,100,2);
    }
}
