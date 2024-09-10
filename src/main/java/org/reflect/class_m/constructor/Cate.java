package org.reflect.class_m.constructor;

public class Cate {
    private String name;
    private String taste;
    private Boolean recommend;

    @Override
    public String toString() {
        return "Cate{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", recommend=" + recommend +
                '}';
    }

    public Cate(){
        System.out.println("无参构造方法");
    }

    public Cate(String name, String taste, Boolean recommend) {
        System.out.println("公共构造方法");
        this.name = name;
        this.taste = taste;
        this.recommend = recommend;
    }

    protected Cate(String name, String taste){
        System.out.println("受保护的构造函数");
        this.name = name;
        this.taste = taste;
    }
    private Cate(String name, Boolean recommend){
        this.name = name;
        this.recommend = recommend;
        System.out.println("私有方法");
    }
    Cate(String name){
        this.name = name;
        System.out.println("默认方法");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }
}
