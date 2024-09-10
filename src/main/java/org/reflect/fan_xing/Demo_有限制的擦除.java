package org.reflect.fan_xing;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/**
 * 泛型只存在于编译期间，实际运行时(反射时)会将泛型提升到上边界(<T extends Number>，上边界为Number)，若无上边界则直接提升到Object
 * */
public class Demo_有限制的擦除 {
    public static void main(String[] args) {
        Class<Example> exampleClass = Example.class;
        Field[] fields = exampleClass.getDeclaredFields();
        for(Field f : fields){
            System.out.println("字段名：" + f.getName() + "   字段类型：" + f.getType());
        }
        Method[] methods = exampleClass.getDeclaredMethods();
        for(Method m : methods){
            System.out.println("方法名：" + m.getName() + "   返回值类型：" + m.getReturnType().getSimpleName());
        }
    }
}
