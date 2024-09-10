package org.lzssl.duotai;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃猫粮");
    }
    @Override
    public void sleep(){
        System.out.println("猫躺着睡");
    }
    public void catchMouse(){
        System.out.println("猫会抓老鼠");
    }
}
