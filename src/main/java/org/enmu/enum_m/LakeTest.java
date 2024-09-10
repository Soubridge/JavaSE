package org.enmu.enum_m;

import org.enmu.base.Season;
import org.junit.Test;

public class LakeTest {
    @Test
    public void test(){
        System.out.println(Lake.LAKE_INFO);
        Lake.method(); //静态成员方法(类方法)
        Lake red = Lake.PoYangHu;
        red.setName("鄱阳湖");
        System.out.println(red.getName());
    }

    @Test public void getEnums(){
        //获取所有的枚举项,同理 这样也会把所有的列举项全部实例化出来
        Lake[] lakes = Lake.values();
        for(Lake lake : lakes){
            System.out.println(lake.name());
        }
        Lake PoYangHu = Lake.valueOf("PoYangHu");
        System.out.println(PoYangHu.name());
    }

    @Test
    public void lakeTest(){
        Lake PoYangHu = Lake.PoYangHu;
        Lake DongTingHu = Lake.DongTingHu;
        Lake HongZeHu = Lake.HongZeHu;

        //.compareTo(x) 返回两个的ordinal的差值
        System.out.println(PoYangHu.compareTo(PoYangHu));
        System.out.println(PoYangHu.compareTo(DongTingHu)); //PoYangHu.ordinal() - DongTingHu.ordinal()
        System.out.println(HongZeHu.ordinal()); //列举项的排位序号

        //Enum类重写了.hashCode()和.equals() 改写成按枚举项是否相同来确定两个是否相等
        Lake PoYangHu1 = Lake.PoYangHu;
        System.out.println(PoYangHu1 == PoYangHu);
        System.out.println(PoYangHu1.equals(PoYangHu));

        //如果枚举中有抽象方法，getDeclaredClass()可以处理内部类的情况,所以枚举实例获取Class建议用.getDeclaredClass()
        //https://blog.csdn.net/DaJian35/article/details/79705193
        Class<Lake> lakeClass = PoYangHu.getDeclaringClass();
        Class<? extends Lake> lakeClass1 = PoYangHu.getClass();
        System.out.println("getClass和getDeclaredClass是否相同:"+(lakeClass1 == lakeClass));

        //可以直接输出和枚举项的名字
        System.out.println(PoYangHu.name());

        //通过枚举项的名字获取枚举项的实例,因为重写了hashCode所以"=="还是为true;
        Lake PoYangHu2 = Lake.valueOf("PoYangHu");
        System.out.println(PoYangHu2 == PoYangHu1);

    }


    @Test
    public void seasonTest(){
        Abstract_enum spring = Abstract_enum.Spring;
        spring.season();
        spring.show();
    }
}
