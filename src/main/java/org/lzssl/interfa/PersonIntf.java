package org.lzssl.interfa;

public class PersonIntf implements ShouInter,JiaoInter{
    public String name;

    public PersonIntf(String name){
        this.name = name;
    }

    public void guzhang(){
        System.out.println(name + "在鼓掌");
    }
    public void xishou(){
        System.out.println(name + "在洗手");
    }

    @Override
    public void jump() {
        System.out.println(name + "在跳高");
    }

    @Override
    public void bool() {
        System.out.println(name + "在踢球");
    }

    @Override
    public void hhh() {

    }
}
