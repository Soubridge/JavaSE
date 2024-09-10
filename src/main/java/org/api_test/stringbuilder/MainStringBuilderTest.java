package org.api_test.stringbuilder;

public class MainStringBuilderTest {
    public static void main(String[] args) {
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb11 = sb1.append("abc");
//        System.out.println(sb1 == sb11); //true,其实地址是没有变化的，只是加长了而已，append返回的是扩展后的对象本身

        StringBuilder sb2 = new StringBuilder("abc");
        sb2.append("de");
        //链式编程：对象的方法返回的是对象本身，然后使用返回的对象继续调用该方法
        sb2.append("fg").append("hi").append("jk").append("lmn");
        System.out.println(sb2);

        StringBuilder sb3 = sb2.reverse();
        System.out.println(sb2 == sb3); //true,为本地反转

        String str = sb3.toString();
        System.out.println(str);
    }
}
