package org.api_test.math;

public class MathTest {
    public static void main(String[] args) {
//        System.out.println(Math.ceil(20.4));//上取整，返回double
//        System.out.println(Math.floor(20.8));//下取整，返回double
//        System.out.println(Math.round(20.4));//四舍五入，返回long
//        System.out.println(Math.round(20.8));//四舍五入，返回long
//        System.out.println(Math.random());//0-1之间随机数

        //生成验证码的小案例
        System.out.println((int)((Math.random()*9+1)*1000));//四位数
        System.out.println((int)((Math.random()*9+1)*100000));//六位数
    }
}
