package org.lzssl.FatherAndSon;

public class Teacher extends Person{
    private String grade;
    private Integer wages;

    public Teacher(String name, Integer age, String grade, Integer wages){
        super(name,age);
        this.grade = grade;
        this.wages = wages;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getWages() {
        return wages;
    }

    public void setWages(Integer wages) {
        this.wages = wages;
    }
    public void teaching(){
        System.out.println("我是个老师在教学");
    }
    public void preShow(){
        super.show();
    }
    @Override
    public void show(){
        super.show();
        System.out.println("还有我是老师，我的等级是"+grade+"，月薪："+wages);
    }
}
