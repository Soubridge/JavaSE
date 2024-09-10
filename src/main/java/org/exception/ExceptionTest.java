package org.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest {
    public static void main(String[] args) {
        //编译时异常 or 运行时异常
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf.parse("2000-10-24");

//        int i = 1/0;
//        try {
//            method1(null);
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("异常信息："+e.getMessage());
//        }
//        System.out.println("测试用，如果中途终止就看不到这条");
        try {
            method3();
        } catch (Exception e) {
            System.out.println("已解决");
        }
    }
    public static void method(){
//        String str = null;
//        try{
//            System.out.println(str.toString());
//        }catch (Exception e){                       //那这个Exception e又是代表什么呢？？？ 可以写多种Exception
//            System.out.println("抓住异常了");
//        }finally{
//            System.out.println("无论如何我都会执行");
//        }

//        String str = null;
//        try {
//            String str1 = (String) new Object();
//            //System.out.println(str.toString());
//        }/*catch (NullPointerException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println("捕获空指针异常");
//        }*/catch (ArithmeticException e){
//            System.out.println("捕获算术异常");
//        }catch (Exception e){
//            System.out.println("异常错误的信息："+e.getMessage());
//            e.printStackTrace();
//            System.out.println("捕获异常");
//        }
    }
    public static void  method1(String str){
        if(str == null){
            //只是手动抛出异常 而不去catch捕获的话， 同样也是会被JVM停止的
            //还有 这个throw直接就是抛出一样，而且这个异常可以指定类型，如果上层不进行处理，和JVM自己发现异常停止是一样的
            //手动抛异常的用处？e.getMessage()能直接显示出预设的信息
            throw new NullPointerException("出现空指针异常！请输入正常数据");
        }
        System.out.println("method1 is running...");
    }
    //你想 throw new Exception("...")是在此处抛出异常
    //那么同样的throws也是抛出异常，不过是在此方法上抛出异常
    //
    public static void method3() throws Exception{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse("2000-08-16");
        System.out.println(date);
        System.out.println("方法执行成功");
    }
}
