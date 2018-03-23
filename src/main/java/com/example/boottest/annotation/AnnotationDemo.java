package com.example.boottest.annotation;

import java.util.ArrayList;
import java.util.List;

public class AnnotationDemo {
    @Override
    @Yibo(comments = "Main method", date = "Nov 17 2012", revision = 3)
    public String toString() {
        return "Override toString method";
    }

    @Deprecated
    @Yibo(comments = "deprecated method", date = "Nov 17 2012")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }

    @Yibo(author = "Xu", comments = "Main method", date = "Nov 17 2012", revision = 10)
    public static void test() {
        List<String> l = new ArrayList<>();
        l.add("abc");
        System.out.println(l);
    }
}