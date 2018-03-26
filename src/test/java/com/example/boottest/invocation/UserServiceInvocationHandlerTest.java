package com.example.boottest.invocation;

import com.example.boottest.service.UserService;
import com.example.boottest.service.impl.UserServiceImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class UserServiceInvocationHandlerTest {
    @Test
    public void test() {
        UserService userService = new UserServiceImpl();
        InvocationHandler invocationHandler = new UserServiceInvocationHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                invocationHandler);
        System.out.println(userServiceProxy.getName(1));
        System.out.println(userServiceProxy.getAge(1));
    }
}