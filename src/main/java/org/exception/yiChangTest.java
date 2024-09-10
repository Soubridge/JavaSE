
/**
 * 出现编译时异常，必须进行处理(不然被JVM给停喽)，可以在方法上声明，或者用try...catch...处理
 * */
package org.exception;


public class yiChangTest {
    public static void main(String[] args) {
        try{
            method();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("抓到你了");
        }

        System.out.println("我执行了，程序正常结束");
    }

    //声明了异常调用者也可以不处理
    private static void method() throws Exception{
//        try {
//            //String s = null;
//            System.out.println(str.toString());
//            String ss = (String) new Object();
//        } catch (Exception e){
//            System.out.println("错误原因：" + e.getMessage());
//            System.out.println("执行代码出现异常");
//            e.printStackTrace(); //打印异常的追踪链路，很重要
//        }

//        if(str == null){
                //能够意识到的异常可以手动抛一下
//            //手动抛出异常后，后面的代码将不会执行，如果没有被某一层catch，程序还是会被jvm给停止
//            throw new ClassCastException("出现空指针异常");
//        }
//        System.out.println("method running...");

        Boolean flag = true;
        if(flag){
            throw new Exception("出现编译时异常");//这个自命名原因也就是方便查看，如果不打印的话不会出现自定义内容
        }
    }
}
