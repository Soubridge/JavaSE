package org.reflect.class_m.field;

import org.junit.Test;
import java.lang.reflect.Field;
/**
 * Field：获取类的属性 xClass.getField("name") 和 xClass.getDeclaredField("name")
 * 同Method方法相似 .getField()可以获得本类和父类的公共(public)方法，.getDeclaredField()能根据名称获得本类所有的方法
 * .getFields() & .getDeclaredFields() 同上
 * */
public class FieldTest {

    @Test
    public void test1() throws NoSuchFieldException {
        Class<Cate> cateClass = Cate.class;
        Field cateField = cateClass.getField("weight");
        System.out.println(cateField);
    }

    @Test
    public void test2(){
        Class<Cate> cateClass = Cate.class;
        //Field[] cateFields = cateClass.getFields();
        Field[] cateFields = cateClass.getDeclaredFields();
        for(Field f : cateFields){
            System.out.println(f);
        }
    }

    @Test
    public void test3(){
        Class<CateSon> cateSonClass = CateSon.class;
        Field[] cateFields = cateSonClass.getFields();
        //Field[] cateFields = cateSonClass.getDeclaredFields();
        for(Field f : cateFields){
            System.out.println(f);
        }
    }
}
