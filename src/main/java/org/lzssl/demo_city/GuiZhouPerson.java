package org.lzssl.demo_city;

public class GuiZhouPerson extends Person implements Sour,Chili{
    public GuiZhouPerson(String name,int age){
        super(name,age);
    }

    public void sour(){
        System.out.println("贵州人吃辣");
    }
    public void chili(){
        System.out.println("贵州人吃酸");
    }
}
