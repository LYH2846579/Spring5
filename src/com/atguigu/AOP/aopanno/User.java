package com.atguigu.AOP.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author LYHstart
 * @create 2022-01-10 10:52
 *
 * 使用注解的方式配置增强
 * 1.在spring配置文件中，开启注解扫描
 * 2.使用注解创建User和UserProxy对象
 * 3.在增强类上面添加注解@Aspect
 * 4.在Spring配置文件中开启生成代理对象
 * 被增强类
 */
@Component
public class User
{
    public void add()
    {
        System.out.println("add...");
    }
}
