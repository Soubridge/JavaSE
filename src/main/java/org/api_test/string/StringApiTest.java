package org.api_test.string;

public class StringApiTest {
    public static void main(String[] args) {
        String str = "hello world!";

//        System.out.println(str.length());//长度
//        System.out.println(str+" lzssl");//尾端连接
//        System.out.println(str.charAt(4));//查看字符串中字符的具体位置
//        System.out.println(str.indexOf("llo"));//看子串首次出现位置

//        char[] chars = str.toCharArray();
//        byte[] bytes = str.getBytes();
//
//        String s = "Hello World!";
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());

        /**切割*/
        String ss = "hello world!";
        System.out.println(ss.substring(2));//包含第2个
        String[] sss = ss.split(" ");
        System.out.println(sss[0]);
    }
}
