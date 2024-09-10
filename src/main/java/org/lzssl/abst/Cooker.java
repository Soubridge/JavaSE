package org.lzssl.abst;

public class Cooker extends HotelWorker{
    public Cooker(){
        super(11,"huofu",5000);
        System.out.println("厨师有参构造完成");
    }
    public void work(){
        System.out.println("我是"+ name +",我的职责是做饭");
    }
}
