package org.annotation.java_api_annotation;

import java.lang.annotation.*;

/**
 *  ==元注解==(Java API提供的注解，这仨注解是用来定义注解的)
 * @Target 标记在注解上，value用于说明该注解的使用位置，value是数组格式，ElementType.XXX 写入的XX表示可以在哪个位置使用
 * @Retention 标记在注解上，RetentionPolicy.SOURCE、RetentionPolicy.CLASS、RetentionPolicy.RUNTIME 分别表示.class前、内存前、内存中
 * @Inherited 标记在注解上，如果某个注解被标注，那么标注改注解的子类也会带该注解[允许注解在父子间继承]
 */

@Target({
        ElementType.TYPE,                 //类，接口
        ElementType.FIELD,                //成员变量(属性)
        ElementType.CONSTRUCTOR,          //构造函数
        ElementType.METHOD,               //成员方法
        ElementType.PARAMETER,            //形参
        ElementType.LOCAL_VARIABLE,       //局部变量
        ElementType.ANNOTATION_TYPE       //注解
})
//@Retention(RetentionPolicy.SOURCE)     //只存在于源码中，编译生成.class文件中就不存在了
//@Retention(RetentionPolicy.CLASS)      //源码、.class文件中存在，运行时内存中没有
@Retention(RetentionPolicy.RUNTIME)      //源码、.class文件、运行时内存都有
@Inherited       //子类中也会有该注解
public @interface Student {

}
