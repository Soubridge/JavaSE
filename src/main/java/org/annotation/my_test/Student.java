package org.annotation.my_test;

public class Student {
    @MyTest
    public void print(){
        System.out.println("我是一名学生");
    }
    @MyTest
    public void print1(){
        System.out.println("我今年18岁");
    }

    public void print3(){
        System.out.println("我在一中上学");
    }
}
