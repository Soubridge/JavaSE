package org.lzssl.abst;

public abstract class HotelWorker {
    public int num;
    public String name;
    public int grade;
    public HotelWorker(){}
    public HotelWorker(int num, String name, int grade) {
        this.num = num;
        this.name = name;
        this.grade = grade;
        System.out.println("酒店员工有参构造完成");
    }

    public abstract void work();
}
