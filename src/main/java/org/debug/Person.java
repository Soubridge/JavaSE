package org.debug;

public class Person {
    //可以直接在类的成员变量打断点监测字段被访问时刻
    private String name;
    private Integer age;

    public Person(){}

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
