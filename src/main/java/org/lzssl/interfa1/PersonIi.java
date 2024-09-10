package org.lzssl.interfa1;

import org.lzssl.interfa.PersonIntf;

public class PersonIi {
    private String name;
    private int age;

    public PersonIi() {
    }
    public PersonIi(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void eat(){
        System.out.println(name + "在吃饭");
    }
    public void sleep(){
        System.out.println(name + "在睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
