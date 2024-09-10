package org.lzssl;

import org.lzssl.interfa1.Danceable;
import org.lzssl.interfa1.Singer;
import org.lzssl.interfa1.Student;

public class MainInterface1 {
    public static void main(String[] args) {
        Singer singer = new Singer("lzssl", 25);
        singer.dance();
        singer.sing();
        singer.yangyong();

        Student zs = new Student("zs", 25);
        zs.study();
        zs.swim();
        zs.yangyong();
        //调用接口的静态(专属)方法时，可以像调用普通类的静态方法，直接“类名.静态方法”
        Danceable.qimawu();
    }
}
