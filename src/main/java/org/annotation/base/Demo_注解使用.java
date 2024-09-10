package org.annotation.base;
/**
 * 当只有value一个属性需要赋值时，可以直接写@Book("什么书")
 * 如果没给默认值 必须要把值给补充上去
 * */
@Book(value = "<java>", price = 45.8, authors = {"小红","小蓝"})
public class Demo_注解使用 {
    //Person注解只有value需要赋值
    @Person("小灰")
    public String name;

    //当给有默认值的属性赋值时，就不止value需要赋值了，这是value需要写成 value=...
    @Person(value = "小蓝", age=18)
    public int age;
}
