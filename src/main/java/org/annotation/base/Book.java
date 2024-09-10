package org.annotation.base;

public @interface Book {
    String value();
    double price() default 100;
    String[] authors();
}
