package org.api_test.system;

import java.util.Date;

public class SystemTest {
    public static void main(String[] args) {
//        long currTime = System.currentTimeMillis();
//        Date date = new Date(currTime);
        for(int i=1; i<=10; i++){
            new Student("夏鸥"+i,24);
        }
        System.gc();//回收垃圾用的
//        Runtime runtime = Runtime.getRuntime();
//        runtime.gc();
    }
}
