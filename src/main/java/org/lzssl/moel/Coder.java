package org.lzssl.moel;

public class Coder extends Person{
    public int money;

    public Coder(String name, int age, int money) {
        super(name, age);
        this.money = money;
    }

    public Coder() {
    }

    public Coder(int money) {
        this.money = money;
    }
    public static void say(){
        System.out.println("我是个coder");
    }
    public void work(){
        System.out.println("我工作敲键盘");
    }
    public void coding(){
        System.out.println(name + "在coding");
    }
}
