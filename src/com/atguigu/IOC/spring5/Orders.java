package com.atguigu.IOC.spring5;

/**
 * @author LYHstart
 * @create 2022-01-06 15:44
 *
 * 为测试有参构造创建的类
 */
public class Orders
{
    private String OrderName;
    private String address;

    //使用有参构造进行属性注入
    public Orders(String orderName, String address) {
        OrderName = orderName;
        this.address = address;
    }

    //输出信息
    public void output()
    {
        System.out.println("OrderName:"+OrderName+"\n"+"address:"+address);
    }
}
