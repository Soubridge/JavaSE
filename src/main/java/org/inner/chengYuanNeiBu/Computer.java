package org.inner.chengYuanNeiBu;

public class Computer {
    double price;
    String color;
    String brand;
    public Computer(){
        System.out.println("外部类电脑已经创建");
    }
    public class Cpu{
        int core;
        int threads;
        public Cpu(){
            System.out.println("内部类cpu已经创建");
        }
        //内部类就像成员函数似的，可以访问外部类的私有成员
        public void run(){
            System.out.println("价格是"+price+"的电脑CPU正在运行");
        }
    }
}
