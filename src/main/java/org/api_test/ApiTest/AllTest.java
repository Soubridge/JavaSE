package org.api_test.ApiTest;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        //Scanner输入
        /*Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String str2 = scanner.nextLine();

        System.out.println("str2 = " + str2); //吃了next没吃下的回车符
        System.out.println("str1 = " + str);*/

        //Random随机数
        /*Random random = new Random();
        for(int i=1; i<=10; i++){
            int num = random.nextInt(20);
            System.out.println(num);
        }*/

        //Runtime JVM的运行信息
        /*Runtime runtime = Runtime.getRuntime();
        System.out.println("maxMemory:" + runtime.maxMemory()/1024/1024);*/

        String str1 = "Hello World!";
        String str2 = "hello world!";
        String str3 = "Hello World!";
        //System.out.println(str1.equalsIgnoreCase(str2));
//        char[] ch = str1.toCharArray();
//        String str4 = str1.toLowerCase();
        //String str4 = str1.toUpperCase();
//        String str4 = str1.replace("o","s");
//        System.out.println(str4);
//        System.out.println(str1.length());
//        System.out.println(str1.charAt(1));
//        System.out.println(str1.indexOf("o"));
//        String str4 = str1.substring(0,5);
//        System.out.println(str4);
//        String[] str = str1.split(" ");
//        System.out.println(str[1]);

        int[] arr = {1,3,4,9,5,6};
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        /*String str = Arrays.toString(arr);
        String strr = str.substring(1,str.length()-1);
        strr = strr.replace(" ", "");
        String[] s = strr.split(",");
        String ss = "";
        for(int i=0; i<s.length; i++){
            ss += s[i];
        }
        System.out.println(ss);
        int num = Integer.parseInt(ss);
        System.out.println(num);*/

        //Date时间相关
//        Date date = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
//        String str = format.format(date);
//        System.out.println(str);
        //StringBuilder 大量拼装时速度快
//        StringBuilder builder = new StringBuilder();
//        builder.append("hello ").append("world!");
//        System.out.println(builder);
        //普通String拼接十万次，4秒
//        Date date = new Date();
//        long oldTime = date.getTime();
//        String s = "";
//        for(int i=0; i<100000; i++){
//            s += "1";
//        }
//        long newTime = new Date().getTime();
//        System.out.println((newTime-oldTime)/1000);
        //使用StringBuilder拼接10万次，用10毫秒左右
//        StringBuilder builder = new StringBuilder();
//        long startTime = new Date().getTime();
//        for(int i=0; i<100000; i++) builder.append("1");
//        long endTime = new Date().getTime();
//        System.out.println((endTime-startTime)/1);

        //把一个数组合起来转成字符串
//        String s = "";
//        for(int i=0; i<arr.length; i++){
//            //s += arr[i]+"";
//            //s += '0'+arr[i]; //这样写在Java中是错误的，后面默认转成ASCII码值
//            s += arr[i]; //这样直接加也是可以的，毕竟s也是字符串，数字+字符串默认把数字转成字符串
//        }
//        System.out.println(s);
    }
}
