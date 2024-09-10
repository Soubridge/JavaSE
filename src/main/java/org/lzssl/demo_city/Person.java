package org.lzssl.demo_city;

public  class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void intro(){
        System.out.println("我的名字是：" + name);
    }
    //？？？其实在这里这样用是不可取的，因为这里的人类也是被抽象出的父类，具体的哪里的人才是”应用场所“
    //？？？这里要写一个travel的功能接口
    public void travel(Province province){
        province.journey();
    }

}
