package org.inner.chengYuanNeiBu;

import javax.print.attribute.standard.MediaSize;

public class Outer {
    public static String province = "山西";
    public String province1 = "山东";
    public static void showOuter(){
        System.out.println(province);
    }
    static class Inner{
        public String city = "太原";
        //静态内部类只能访问外部的静态方法
        public void shouInner(){
            System.out.println(province+"省的省会是："+city);
        }
        public String getProvince(){
            return Outer.province;
        }
        public void setProvince(String province){
            Outer.province = province;
        }

    }

}

