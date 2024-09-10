package org.api_test.stringbuilder;

import java.util.Date;

public class StringBuilderXingNeng {
//    public static void main(String[] args) {
//
//        long startTime = new Date().getTime();
//
//        String str = "";
//        for(int i = 0; i<100000; i++){
//            str = str + "1";
//        }
//        long endTime = new Date().getTime();
//
//        System.out.println((endTime-startTime));
//    }
    public static void main(String[] args) {
        long startTime = new Date().getTime();

        StringBuilder builder = new StringBuilder();
        for (int i=0;i<100000;i++){
            builder.append("1");
        }
        long endTime = new Date().getTime();

        System.out.println(endTime-startTime);
    }
}
