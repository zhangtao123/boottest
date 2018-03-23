package com.example.boottest.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationParsing {
    public static void test() {
        try {
            for (Method method : AnnotationParsing.class
                    .getClassLoader()
                    .loadClass(AnnotationDemo.class.getName())
                    .getMethods()) {
                if (method.isAnnotationPresent(Yibo.class)) {
                    try {
                        for (Annotation annotation : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method: " + method + " : " + annotation);
                        }
                        Yibo yibo = method.getAnnotation(Yibo.class);
                        if (yibo.revision() == 1) {
                            System.out.println("Method with revision no 1 = " + method);
                        }
                    } catch (Throwable e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}