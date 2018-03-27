package com.example.boottest.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceInvocationHandler implements InvocationHandler {
    private Object target;

    public UserServiceInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("getName".equals(method.getName())) {
            System.out.println("---before:" + method.getName() + "---");
            Object result = method.invoke(target, args);
            System.out.println("---after:" + method.getName() + "---");
            System.out.println("---下一个方法---");
            return result;
        } else {
            return method.invoke(target, args);
        }
    }
}