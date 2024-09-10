package org.lzssl.demo_city;

public class JiangXiPerson extends Person implements Chili{
    public JiangXiPerson(String name,int age){
        super(name,age);
    }

    public void chili(){
        System.out.println("江西人吃辣");
    }
}
