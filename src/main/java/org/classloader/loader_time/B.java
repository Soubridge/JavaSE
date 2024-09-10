package org.classloader.loader_time;

public class B extends A{
    public static Integer num = 20;
    static {
        System.out.println("B loader...");
    }
}
