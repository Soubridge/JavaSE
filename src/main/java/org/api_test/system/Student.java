package org.api_test.system;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println(name+"被回收了");
    }
}
