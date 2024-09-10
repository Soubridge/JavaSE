package org.reflect.class_m.constructor;

import org.junit.Test;
import org.reflect.class_m.constructor.Cate;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/**
 * Construction 类常用的方法有两个 .newInstance() .setAccessible()
 * Class类也有.newInstance()方法，与构造器类(Constructor)类不同的是，Class类只能调用类的无参构造函数，而构造器类可以根据
 *                  xClass.getDeclaredConstructor(1,2,3)获得的指定构造器来进行带参构造
 * .setAccessible(true) 表示可以突破构造器的访问限制，下面test1不用这个是因为 拿到的构造器是protect的，而两个类在同一个包，所有没有越界
 **/

public class ConstructorTest1 {
    @Test
    public void test1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Cate> classCate = Cate.class;
        Constructor<Cate> constructor = classCate.getDeclaredConstructor(String.class, String.class);
        Cate cate = constructor.newInstance("香芋地瓜丸", "甜");
        System.out.println(cate);
    }

    @Test
    public void test() throws Exception{
        Class<Cate> cateClass = Cate.class;
        Constructor<Cate> constructor = cateClass.getDeclaredConstructor(String.class, Boolean.class);
        constructor.setAccessible(true);
        Cate cate = constructor.newInstance("香芋地瓜丸",true);
        System.out.println(cate.getName());
    }
}
