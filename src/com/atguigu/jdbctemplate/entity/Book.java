package com.atguigu.jdbctemplate.entity;

/**
 * @author LYHstart
 * @create 2022-01-11 10:21
 *
 * 实体类
 */
public class Book
{
    private String userId;
    private String userName;
    private String uStatus;

    public Book() {
    }
    public Book(String userId, String userName, String uStatus) {
        this.userId = userId;
        this.userName = userName;
        this.uStatus = uStatus;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getuStatus() {
        return uStatus;
    }
    public void setuStatus(String uStatus) {
        this.uStatus = uStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", uStatus='" + uStatus + '\'' +
                '}';
    }
}
