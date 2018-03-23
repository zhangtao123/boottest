package com.example.boottest.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Yibo {
    String author() default "Yibo";

    String date();

    int revision() default 1;

    String comments();
}