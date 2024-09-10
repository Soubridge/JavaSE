package org.lzssl.interfa1;

public class Singer extends PersonIi implements Danceable,Swimmable{
    public Singer(String name, int age){
        super(name,age);
    }
    public void sing(){
        System.out.println("歌手" + getName() + "在唱歌");
    }

    public void dance(){
        System.out.println("歌手" + getName() + "在跳舞");
    }
    public void swim(){
        System.out.println("歌手" + getName() + "在游泳");
    }
    @Override//重写"实现的Swimable接口中的yangyong默认方法"
    public void yangyong(){
        System.out.println("歌手" + getName() + "在仰泳");
    }
}
