package com.atguigu.AOP.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 * @author LYHstart
 * @create 2022-01-10 10:53
 *
 * 增强类
 * before around....
 * before...
 * add...
 * after around....
 * after....
 * afterReturning....
 */
@Component
@Aspect
public class UserProxy
{
    //前置通知
    @Before(value = "execution(* com.atguigu.AOP.aopanno.User.add(..))")
    public void before()
    {
        System.out.println("before...");
    }

    //后置通知
    @After(value = "execution(* com.atguigu.AOP.aopanno.User.add(..))")
    public void after()
    {
        System.out.println("after....");
    }

    @AfterReturning(value = "execution(* com.atguigu.AOP.aopanno.User.add(..))")
    public void afterReturning()
    {
        System.out.println("afterReturning....");
    }

    @AfterThrowing(value = "execution(* com.atguigu.AOP.aopanno.User.add(..))")
    public void afterThrowing()
    {
        System.out.println("afterThrowing....");
    }

    @Around(value = "execution(* com.atguigu.AOP.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable
    {
        System.out.println("before around....");
        pjp.proceed();
        System.out.println("after around....");
    }

}
