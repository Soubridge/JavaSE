package org.lzssl.moel;

public class Person {
    public String name;
    public int age;
    public static int hh = 25;
    public static int sex = 1;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void say(){
        System.out.println("我是个人");
    }
    public void work(){
        System.out.println("你也没说啥工作啊");
    }
    public Person(){
        System.out.println(name + "的人被实例化");
    }

    public void eat(){
        System.out.println(name + "在吃饭");
    }
    public void sleep(){
        System.out.println(name + "在睡觉");
    }
}
