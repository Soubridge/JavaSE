package org.reflect.class_m.field;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldTest1 {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Cate> cateClass = Cate.class;
        Cate cate = cateClass.newInstance();
        Field cateField = cateClass.getField("username");
        cateField.set(cate,"lsl");
        Object obj = cateField.get(cate);
        System.out.println(obj);
    }
    @Test
    public void test2() throws NoSuchFieldException, IllegalAccessException {
        Class<Cate> cateClass = Cate.class;
        Field cateField = cateClass.getDeclaredField("e_mail");
        Class<?> fieldClass = cateField.getType();
        System.out.println("属性e_mail的类型是：" + fieldClass);
        cateField.setAccessible(true);
        Cate cate = new Cate();
        cateField.set(cate,"1546101323@qq.com");
        String str = (String) cateField.get(cate);
        System.out.println(str);
    }
}
