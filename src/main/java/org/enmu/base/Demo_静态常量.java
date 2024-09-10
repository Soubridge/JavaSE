package org.enmu.base;

import org.junit.Test;

public class Demo_静态常量 {

    @Test
    public void test(){
        method(Season.SPRING);
    }
    public void method(Integer season){
        switch (season){
            case 1:
                System.out.println("春天");
                break;
            case 2:
                System.out.println("夏天");
                break;
            case 3:
                System.out.println("秋天");
                break;
            case 4:
                System.out.println("冬天");
                break;
        }
    }
}
