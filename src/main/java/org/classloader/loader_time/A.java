package org.classloader.loader_time;

public class A {
    public static Integer num = 10;
    static {
        System.out.println("A loader...");
    }
}
