package org.lzssl.moel;

public class Teacher extends Person {
    public String grade;

    public Teacher(String grade) {
        super("lzssl",20);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void teachering() {
        System.out.println(name + "在教学");
    }
}