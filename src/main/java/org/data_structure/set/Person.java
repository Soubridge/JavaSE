package org.data_structure.set;

public class Person implements Comparable{
    private String name;
    private Integer age;

    @Override
    public int compareTo(Object o){
        Person per = (Person)o;
        return this.getAge()-per.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, Integer age){
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
