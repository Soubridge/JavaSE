package org.reflect.reflect_test;

import org.junit.Test;
import org.reflect.class_m.constructor.Cate;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Reflect_EX {
    @Test
    public void test() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new InputStreamReader(Reflect_EX.class.getClassLoader().getResourceAsStream("cate.properties"), StandardCharsets.UTF_8));
        String className = properties.getProperty("class");
        Class<Cate> cateClass =(Class<Cate>) Class.forName(className);


//        Class<Cate> cateClass = Cate.class;
        Cate cate = cateClass.newInstance();
        Field[] cateFields = cateClass.getDeclaredFields();
        for(Field f : cateFields){
            Object arg = properties.get(f.getName());
            Object value = transform(f,(String)arg);
            System.out.println(arg);
            f.setAccessible(true);
            f.set(cate, value);
        }
        System.out.println(cate);
    }
    public static Object transform(Field f, String str){
        if(f.getType() == String.class)
            return str;
        else
            return Boolean.parseBoolean(str);
    }
}
