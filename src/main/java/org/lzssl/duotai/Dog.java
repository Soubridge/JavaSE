package org.lzssl.duotai;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
    @Override
    public void sleep(){
        System.out.println("狗趴着睡");
    }

    public void kanJia(){
        System.out.println("狗子可以看家");
    }
}
