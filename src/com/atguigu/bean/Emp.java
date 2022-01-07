package com.atguigu.bean;

/**
 * @author LYHstart
 * @create 2022-01-07 11:27
 *
 * 用于测试级联赋值和内部Bean的类
 */
public class Emp
{
    private String eName;
    private String gender;
    //所属部门
    private Dept dept;

    public void seteName(String eName) {
        this.eName = eName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    //生成get方法
    public Dept getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eName='" + eName + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
