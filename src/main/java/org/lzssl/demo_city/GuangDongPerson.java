package org.lzssl.demo_city;

public class GuangDongPerson extends Person implements Sweet{
    public GuangDongPerson(String name, int age) {
        super(name, age);
    }

    public void sweet(){
        System.out.println("广东人吃甜");
    }
    public void sour(){
        System.out.println("广东人吃酸");
    }
}
