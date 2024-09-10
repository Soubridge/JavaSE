package org.api_test.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainDateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateFormat = format.format(date);
        System.out.println(dateFormat);
        /**计算一个人出生多少天了*/
        /*Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入出生年份：");
        String yyyy = scanner.nextLine();
        System.out.println("输入出生月份：");
        String MM = scanner.nextLine();
        System.out.println("输入几号出生：");
        String dd = scanner.nextLine();
        String str = yyyy+"-"+MM+"-"+dd;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = format.parse(str);
            System.out.println((date.getTime()-date1.getTime())/(3600*24*1000));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }*/
    }
}
