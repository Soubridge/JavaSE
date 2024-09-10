package org.enmu.enum_m;

/**
 * 如果枚举项后面还有其他成员方法，最后一项要加分号，枚举项必须写在第一行
 * 枚举类也可以有成员变量、静态变量、静态方法、成员方法(get、set)
 * 只要是调用到枚举类(静态方法、静态成员、其中某个枚举项)，所有的枚举实例都会被创建、调用的无参构造函数、固定的是private修饰【.class不会】
 * 也可以有带参构造函数，不过在列举枚举项的时候就要把参数给带着，获取实例还是用Lake.DongTingHu;
 * */
public enum Lake {
    PoYangHu,DongTingHu("洞庭湖", "湖北"),TaiHu,HongZeHu,ChaoHu;

    private Lake(){
        System.out.println("调用了Lake的无参构造函数");
    }
    Lake(String name, String area){
        this.name = name;
        System.out.println(this.name + "创建调用有参构造函数" + "，地区在" + area);
    }
    public static String LAKE_INFO = "此枚举类型描述中国五大湖";
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void method(){
        System.out.println("鄱阳湖、洞庭湖、太湖、洪泽湖、巢湖");
    }
}
