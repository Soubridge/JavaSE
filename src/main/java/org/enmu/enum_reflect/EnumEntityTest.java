package org.enmu.enum_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EnumEntityTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<EnumEntity> enumClass = EnumEntity.class;
        //注意枚举的构造方法不能被反射
        /*Constructor<EnumEntity> enumEntityConstructor = enumClass.getDeclaredConstructor();
        enumEntityConstructor.setAccessible(true);
        EnumEntity enumEntity = enumEntityConstructor.newInstance();*/
        EnumEntity enumEntity = EnumEntity.AAA;

        //变量
        Field enumField = enumClass.getDeclaredField("test_02");
        enumField.setAccessible(true);
        System.out.println( enumField.get(enumEntity) );
        enumField.set(enumEntity, "啊？");
        System.out.println( enumField.get(enumEntity) );

        //方法
        Method method = enumClass.getDeclaredMethod("testMethod_02");
        method.setAccessible(true);
        Object result = method.invoke(enumEntity,null);
        System.out.println(result);
    }
}
