package org.annotation.parse;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * 如果某个注解的声明周期是RetentionPolicy.SOURCE，那么在解析中.isAnnotation()也查不出该注解，解析必须RetentionPolicy.RUNTIME
 * xClass、xMethod、xField、xConstructor  .isAnnotationPresent(@yClass) 直接在....上是否有标记Y注解
 * xClass.getAnnotations()获取X类上和其父类(允许继承)的所有注解，xClass.getDeclaredAnnotation()获取x类上的所有注解
 * */
public class OtherParesMethods {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<TestComputer> computerClass = TestComputer.class;
        Class<Computer> cCLass = Computer.class;

        System.out.println("Computer类是否是一个注解:" + cCLass.isAnnotation());
        System.out.println("TestComputer类上是否有Computer注解:" + computerClass.isAnnotationPresent(Computer.class));

        Method computerMethod = computerClass.getMethod("print",null);
        System.out.println("方法name上是否有注解:" + computerMethod.isAnnotationPresent(Computer.class));

        //继承测试
        Class<SubTestComputer> subTestComputerClass = SubTestComputer.class;
        Annotation[] annotations = subTestComputerClass.getAnnotations();
        //Annotation[] annotations = subTestComputerClass.getDeclaredAnnotations();
        for(Annotation annotation : annotations){
            System.out.println(annotation);
        }

    }
    @Test
    public void test(){
       Class<TestComputer> computerClass = TestComputer.class;
       Computer computer = computerClass.getAnnotation(Computer.class);
        System.out.println(computer.value());
    }
}
