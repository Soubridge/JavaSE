package org.annotation.my_test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo_Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Student> studentClass = Student.class;
        Method[] methods = studentClass.getDeclaredMethods();
        Student student = studentClass.newInstance();
        for(Method m : methods){
            if(m.isAnnotationPresent(MyTest.class)){
                m.setAccessible(true);
                m.invoke(student,null);
            }
        }
    }
}
