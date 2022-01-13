package com.atguigu.jdbctemplate.transaction;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author LYHstart
 * @create 2022-01-13 9:58
 *
 * 完全注解开发之中的配置类
 */
@Configuration      //声明配置类
@ComponentScan(basePackages = "com.atguigu.jdbctemplate")   //组件扫描
@EnableTransactionManagement        //开启事务
public class TxConfig
{
    //创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource()
    {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/user_db");
        dataSource.setName("root");
        dataSource.setPassword("3306");
        return dataSource;
    }

    //创建JDBCTemplate对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource)
    {
        //到IOC容器之中根据类型找到dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //注入DataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource)
    {
        DataSourceTransactionManager dstm = new DataSourceTransactionManager();
        dstm.setDataSource(dataSource);
        return dstm;
    }
}
