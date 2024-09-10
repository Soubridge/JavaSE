package org.debug;
/**
 * 用于分析菱形断点、眼睛断点
 * */
public class DanceTest {
    public static void main(String[] args) {
//        Danceable danceable = new Dancer();
//        Danceable danceable1 = new Singer();
//        danceable.dance();
//        danceable1.dance();
        Person person = new Person();
        person.setAge(20);
        person.setName("lsl");
        System.out.println(person.getName());
    }
}
