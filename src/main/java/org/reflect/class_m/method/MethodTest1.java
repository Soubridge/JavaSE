package org.reflect.class_m.method;

import org.junit.Test;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * Method不像Constructor拿过来就可以用，因为调用方法的时候可能会涉及到对实例参数的使用，所以还需呀提供一个实例，这样就可以用这个实例去做this...
 *                 实际上类方法static可以不用提供这个实例，因为类方法根本不会出现this.name类似的东西，但为了API统一也需要给个null
 * 具体的使用方法是xMethod.invoke(obj,args) obj:提供的对应类的实例，args:方法的参数(要对应好)
 * .invoke(obj,args)返回值是Object类型的result，这个就是反射调用的那个函数的返回值
 * 同理，如果是需要越过限定修饰符，则需要xMethod.setAccessible(true)来设定
 * */
public class MethodTest1 {
    //无参公共方法
    @Test
    public void test1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Cate> cateClass = Cate.class;
        Method cateMethod = cateClass.getMethod("eat",null);
        Object result = cateMethod.invoke(new Cate("香芋地瓜丸","甜",true),null);
        System.out.println("方法名称是:" + cateMethod.getName() + "执行结果是" + result);
    }
    //带参公共返回值
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Cate> cateClass = Cate.class;
        Method cateMethod = cateClass.getDeclaredMethod("b", String.class);
        Object result = cateMethod.invoke(new Cate("香芋地瓜丸","甜",true),"啊？");
        System.out.println("方法名是：" + cateMethod.getName() + "执行结果：" + result);
    }
    //无参公共静态无返回
    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Cate> cateClass = Cate.class;
        Method cateMethod = cateClass.getMethod("d");
        cateMethod.invoke(null, null);
    }

    //无参=私有=方法
    @Test
    public void test4() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Cate> cateClass = Cate.class;
        Method cateMethod = cateClass.getDeclaredMethod("c");
        cateMethod.setAccessible(true);
        Object result = cateMethod.invoke(new Cate(), null);
        System.out.println("方法名："+cateMethod.getName()+", 方法修饰符"+cateMethod.getModifiers()+", 返回值为："+result);
    }
    //测试获取父类的方法
    @Test
    public void test5() throws NoSuchMethodException {
        Class<CateSon> cateSonClass = CateSon.class;
        //Method[] cateSonMethods = cateSonClass.getMethods();
        Method[] cateSonMethods = cateSonClass.getDeclaredMethods();
        for(Method m : cateSonMethods){
            System.out.println(m);
        }
    }
}
