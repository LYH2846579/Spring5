package com.atguigu.AOP;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author LYHstart
 * @create 2022-01-10 9:56
 *
 * 调用Proxy中的newProxyInstance方法来创建原对象的代理
 */
public class JDKProxy
{
    @Test
    public void test01()
    {
        //1.创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (com.atguigu.AOP.UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = dao.add(1, 2);
        System.out.println("结果为:"+add);
    }
}

//创建代理对象    -> 实现InvocationHandler接口，重写invoke方法
class UserDaoProxy implements InvocationHandler
{
    private Object obj;

    //将被代理对象传入代理对象之中
    //使用有参数构造传递
    public UserDaoProxy(Object obj)
    {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前执行..."+method.getName()+"传递的参数..."+ Arrays.toString(args));
        Object invoke = method.invoke(obj, args);
        System.out.println("方法之后执行...."+obj);
        return invoke;
    }
}
