package com.atguigu.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author LYHstart
 * @create 2022-01-08 11:20
 *
 * 实现后置处理器
 */
public class MyBeanPost implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("===在初始化之前执行的方法===");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("===在初始化之后执行的方法===");
        return bean;
    }
}
