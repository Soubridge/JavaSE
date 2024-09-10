package org.lzssl;

import org.lzssl.moel.Coder;
import org.lzssl.moel.Person;

public class MainStaticTest {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.say();

        Person coder = new Coder();
        coder.say();

        Person coder1 = new Coder();
        coder1.work();

        //System.out.println(Coder.sex);
    }
}

