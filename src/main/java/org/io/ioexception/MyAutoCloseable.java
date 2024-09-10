package org.io.ioexception;

public class MyAutoCloseable implements AutoCloseable{
    public MyAutoCloseable(){
        // int i = 1/0;
    }
    public void test(){
        System.out.println("测试方法");
    }

    @Override
    public void close(){
        System.out.println("自己类的close方法被调用了");
    }

}
