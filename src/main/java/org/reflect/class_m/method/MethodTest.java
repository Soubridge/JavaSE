package org.reflect.class_m.method;

import org.junit.Test;
import java.lang.reflect.Method;
/**
 * 像获取构造函数一样，分为xClass.getMethod() 和 xClass.getDeclaredMethod() ,相较于构造函数，这个还需要加函数名(毕竟构造函数没必要)
 * 同理.getMethods()和.getDeclaredMethods()也可以获得所有的方法
 * PS:如果方法没有参数，param可以空置或写null
 *
 * 注意：.getMethod()方法能获得本类和父类的公开方法(public), .getDeclaredMethod()可以获得本类的公开或非public方法  【除开构造函数】
 *      .getMethods() & .getDeclaredMethods() 同上
 * */

public class MethodTest {
    @Test
    public void test1() throws NoSuchMethodException {
        Class<Cate> cateClass = Cate.class;
        Method method = cateClass.getMethod("eat");
        System.out.println(method);
    }
    //像Constructor一样，私有方法也是可以直接反射出来，但是？
    @Test
    public void test2() throws NoSuchMethodException {
        Class<Cate> cateClass = Cate.class;
        Method method = cateClass.getDeclaredMethod("wen",String.class);
        System.out.println(method);
    }
    //获取所有的方法，并不会把构造函数也给搞出来,静态方法也会搞出来
    @Test
    public void test3(){
        Class<Cate> cateClass = Cate.class;
        Method[] methods = cateClass.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m);
        }
    }
}
