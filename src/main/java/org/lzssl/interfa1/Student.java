package org.lzssl.interfa1;

public class Student extends PersonIi implements Swimmable{
    public Student(String name, int age) {
        super(name, age);
    }
    public void study(){
        System.out.println("学生" + super.getName() + "在学习");
    }

    public void swim(){
        System.out.println("学生" + super.getName() + "在游泳");
    }

}
