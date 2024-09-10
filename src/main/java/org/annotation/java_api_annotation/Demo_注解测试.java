package org.annotation.java_api_annotation;
/**
 *未限制的注解可以使用在 其他注解、类、类属性、构造方法、普通方法、形参、局部变量上
 * */
@Student
public class Demo_注解测试 {
    @Student
    public String name;

    @Student
    public Demo_注解测试(){}

    @Student
    public void method(@Student int age){
        @Student
        String str;
    }
}
