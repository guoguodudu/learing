package com.example.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("开始记录日志，添加用户方法开始执行...");
        method.invoke(target, args);
        System.out.println("开始记录日志，添加用户方法执行结束...");
        return null;
    }
}
