package com.example.designpattern.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class TestProxy {

    public static void main(String[] args) {
        UserDao userDAO = new UserDaoMysqlImpl();
        LogHandler li = new LogHandler(userDAO);  //创建一个Handerler对象

        userDAO.addUser(1);


        UserDao userDAOProxy = (UserDao) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), li);
        userDAOProxy.addUser(1);
    }
}
