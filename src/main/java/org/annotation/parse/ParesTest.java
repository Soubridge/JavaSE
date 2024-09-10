package org.annotation.parse;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
/**
 * 解析注释其实是先找到这个类型的Class、Field、Constructor、Method对象，然后找标记在这些对象上的注解，获得注解对象
 * 比如想要Computer注解对象用来解析 Computer computer = xClass.getAnnotation(Computer.class) //参数表示加在这个x类上的注释类型，通过这个类型来找注解对象
 * 获得标记在Class...的注解后可以用.value等等方法来获得注解的值
 * .getAnnotation(@xClass),获取一个注解时已经指定是哪个注解了，所以直接可以返回这个注解的实例，赋值给具体的注解X x
 * .getAnnotations(),获取的是多个注解，不知道注解的具体类，只能用更高级的注解接口组Annotation[]来接
 * */
public class ParesTest {
    @Test
    public void test1(){
        Class<TestComputer> computerClass = TestComputer.class;
        Computer computer = computerClass.getAnnotation(Computer.class);
        Phone phone = computerClass.getAnnotation(Phone.class);
        System.out.println(computer.price());
        System.out.println(computer.value());
        System.out.println(Arrays.toString(computer.factories()));
        System.out.println(phone.value());
    }

    @Test
    public void test2() throws NoSuchFieldException, NoSuchMethodException {
        Class<TestComputer> computerClass = TestComputer.class;
        Field computerField = computerClass.getDeclaredField("name");
        Computer computer = computerField.getAnnotation(Computer.class);

//        Method computerMethod = computerClass.getMethod("print",null);
//        Computer computer1 = computerMethod.getAnnotation(Computer.class);
//        Constructor<TestComputer> computerConstructor = computerClass.getConstructor();
//        Computer computer2 = computerConstructor.getAnnotation(Computer.class);

        System.out.println(computer.value());
        System.out.println(computer.price());
        System.out.println(Arrays.toString(computer.factories()));
    }
}
