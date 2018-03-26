package com.example.boottest.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface Property {
    String column();
    String type();
}