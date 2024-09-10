package org.enmu.enum_reflect;
/**
 * 枚举类的构造方法不可以被反射获取，其他的成员变量、方法都可以像一般类一样反射
 * */
public enum EnumEntity {
    AAA, BBB;
    EnumEntity(){
        System.out.println("调用了枚举的无参构造方法");
    }
    EnumEntity(String str){
        System.out.println("调用了有参构造函数");
    }
    public String test_01 = "100";
    private String test_02 = "200";

    public void testMethod_01(){
        System.out.println("testMethod_01");
    }
    private void testMethod_02(){
        System.out.println("testMethod_02");
    }


    public String getTest_01() {
        return test_01;
    }

    public void setTest_01(String test_01) {
        this.test_01 = test_01;
    }

    public String getTest_02() {
        return test_02;
    }

    public void setTest_02(String test_02) {
        this.test_02 = test_02;
    }
}
