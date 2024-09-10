package org.io.ioexception;
/**
 * 打印结果显示调用了重写的.close()方法
 * 说明:以后如果写资源处理的类(字节流、字符流)，只要重写了AutoCloseable的close()方法就可以把他放到try()中，结束后可以自动调用重写的.close()方法
 * */
public class MyAutoCloseableTest {
    public static void main(String[] args) {
        try (MyAutoCloseable closeable = new MyAutoCloseable()){
            closeable.test();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
