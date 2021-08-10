package com.andrew.test.proxy;

import com.andrew.test.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InvocationHandler invocationHandler = (proxy, method, args1) -> {
            if (method.getName().equals("findUserById")) {
                return ((IUserDao) proxy).findUserById(Integer.parseInt(args1[0].toString()));
            }
            return null;
        };

        IUserDao instance = (IUserDao)Proxy.newProxyInstance(classLoader, new Class[]{IUserDao.class}, invocationHandler);
        User user = instance.findUserById(1);
        System.out.println(user);
    }

}
