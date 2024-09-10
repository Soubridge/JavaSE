package org.reflect.class_m.field;

public class Cate {
    public String username = "root";
    protected String password = "admin";
    String phone = "110";
    private String e_mail = "110@abc.com";
    public Integer weight;
    private String name;
    private String taste;
    private Boolean recommend;

    public void eat(){
        System.out.println("我用嘴吃");
    }
    protected void wen(String left){
        System.out.println("我用" + left + "闻");
    }
    public String a(){
        System.out.println("我是共有方法");
        return  "ok_a";
    }
    public String b(String param){
        System.out.println("我是公共有参方法，参数是：" + param);
        System.out.println("测试一下我的name:" + this.name);
        return "ok_b";
    }
    private void c(){
        System.out.println("我是私有方法");
    }
    public static void d(){
        System.out.println("我是公共静态方法");
    }
    private static void e(){
        System.out.println("我是静态私有方法");
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
