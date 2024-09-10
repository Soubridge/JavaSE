package org.reflect.fan_xing;

import java.lang.reflect.Method;
/**
 * 一个类如果实现了带有泛型的接口，并且把这个泛型具体化了(擦除)，但JVM还是会帮助生成那个接口中被擦除的方法[上边界或Object]
 * */
public class Demo_泛型桥接 {
    public static void main(String[] args) {
        Class<ExampleImpl> exampleImplClass = ExampleImpl.class;
        Method[] methods = exampleImplClass.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m);
        }
    }
}

//public java.lang.Number org.reflect.fan_xing.ExampleImpl.method(java.lang.Number)
//public java.lang.Object org.reflect.fan_xing.ExampleImpl.method(java.lang.Object)