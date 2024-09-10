package org.api_test.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainDateTest1 {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd hh-mm-ss");
        String str = format.format(date);
        System.out.println(str);

    }
}
