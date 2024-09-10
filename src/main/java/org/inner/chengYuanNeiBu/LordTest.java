package org.inner.chengYuanNeiBu;

public class LordTest {
    static{
        //静态代码块是在类加载时就执行的函数
        System.out.println("我是外部类的静态代码块");
    }
    static class Inner{
        static {
            System.out.println("我是内部类的静态代码块");
        }
    }
}


