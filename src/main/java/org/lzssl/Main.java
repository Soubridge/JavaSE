package org.lzssl;

import org.lzssl.moel.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        m1(ctx);
    }

    private static void m1(ClassPathXmlApplicationContext ctx) {
        User u1 = ctx.getBean("user1", User.class);
        System.out.println("u1 = " + u1);
    }
}
