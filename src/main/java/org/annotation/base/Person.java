package org.annotation.base;

public @interface Person {
    String value();
    int age() default 18;
}
