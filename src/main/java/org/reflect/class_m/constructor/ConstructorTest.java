package org.reflect.class_m.constructor;

import org.junit.Test;
import org.reflect.class_m.method.Cate;

import java.lang.reflect.Constructor;
/**
 * 可以依据Class类(描述.class文件的)来获得对应类的构造函数，主要有 xClass.getConstructor( type(param).class... ) 和 xClass.getDeclaredConstructor(...)
 * .getConstructor() 依据形参获取公共构造方法(public)，.getDeclaredConstructor() 依据参数列表获取任意修饰符修饰的构造函数
 * .getConstructors()和.getDeclaredConstructors()获取对应所有的构造函数
 * 注意：使用.getDeclaredConstruct()和.getDeclaredConstructs()也会把公共的(public)构造方法一并获取到
 *
 * 不要担心参数混乱的问题，方法重载已经解决好了(重载：方法名相同，==参数列表不同==)
 * */
public class ConstructorTest {
    //反射无参构造方法
    @Test
    public void test1() throws NoSuchMethodException {
        Class<Cate> cateClass = Cate.class;
        Constructor<Cate> constructor = cateClass.getConstructor();
        System.out.println(constructor);
    }
    //反射参数列表构造方法
    @Test
    public void test2() throws NoSuchMethodException {
        Class<Cate> cateClass = Cate.class;
        Constructor<Cate> constructor = cateClass.getConstructor(String.class, String.class, Boolean.class);
        System.out.println(constructor);
    }
    //反射参数列表构造方法(任意修饰符),
    @Test
    public void test3() throws NoSuchMethodException {
        Class<Cate> cateClass = Cate.class;
        Constructor<Cate> constructor = cateClass.getDeclaredConstructor(String.class, Boolean.class);
        System.out.println(constructor);
    }
    //反射所有构造方法
    @Test
    public void test4(){
        Class<Cate> cateClass = Cate.class;
        Constructor<?>[] constructors = cateClass.getDeclaredConstructors();
        for(Constructor<?> cons : constructors){
            System.out.println(cons);
        }
    }

}
