package com.example.designpattern.proxy.dynamicproxy;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void addUser(Integer integer) {

            // TODO Auto-generated method stub
            System.out.println("connect to MySQL DataBase...");
            System.out.println("id为"+integer+"的用户信息成功添加到数据库表中...");

    }
}
