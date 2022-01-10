package com.atguigu.IOC.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author LYHstart
 * @create 2022-01-07 14:23
 *
 * 测试注入Array、List、Map、Set等
 */
public class Stu
{
    private String[] array;
    private List list;
    private Map map;
    private Set set;

    public void setArray(String[] array) {
        this.array = array;
    }
    public void setList(List list) {
        this.list = list;
    }
    public void setMap(Map map) {
        this.map = map;
    }
    public void setSet(Set set) {
        this.set = set;
    }

    //输出测试
    public void output()
    {
        System.out.println(Arrays.toString(array));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
    }
}
