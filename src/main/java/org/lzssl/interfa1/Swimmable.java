package org.lzssl.interfa1;

public interface Swimmable {
    public abstract void swim();

    //接口的默认方法，可以直接被实现类继承和重写
    default void yangyong(){
        System.out.println("在仰泳");
    }
}
