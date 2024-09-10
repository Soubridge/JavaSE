package org.enmu.base;

import org.junit.Test;

public class EnumAndSwitch {
    @Test
    public void test(){
        //Season_enum season_enum = new Season_enum();
        Season_enum season_enum = Season_enum.SUMMER;


        switch (season_enum){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
            default:
                System.out.println("季节错误");
        }
    }
}
