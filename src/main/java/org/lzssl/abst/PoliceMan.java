package org.lzssl.abst;

public class PoliceMan extends HotelWorker{
    public PoliceMan(){
        super(22,"baoan",5000);
        System.out.println("保安有参初始化完成");
    }
    public void work(){
        System.out.println("我是保安，检查进入人员");
    }

}
