package com.atguigu.IOC.lifecycle;

/**
 * @author LYHstart
 * @create 2022-01-08 10:58
 *
 * 测试Bean的声明周期所用到的类
 */
public class Order
{
    private String oName;

    public Order() {
        System.out.println("构造器被调用");
    }

    public void setoName(String oName) {
        this.oName = oName;
        System.out.println("属性set方法被调用");
    }

    public void initMethod()
    {
        System.out.println("初始化方法被调用");
    }

    public void destroyMethod()
    {
        System.out.println("销毁方法被调用");
    }
}
