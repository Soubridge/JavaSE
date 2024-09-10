package org.data_structure.set;


import java.util.HashSet;

/**Set方法和Collection都是单列集合，方法基本基本一致，但底层实现方式不同
 * HashSet是set的实现类，内部存储的数据无序且不重复【存取顺序不同，存放是根据hash算法得到的】
 * */
public class HashSetTest {
    public static void main(String[] args) {
//        HashSet<String> cities = new HashSet<>();
//        cities.add("合肥");cities.add("南昌");cities.add("武汉");cities.add("郑州");
//        //System.out.println(cities); //并不是根据.add的顺序来排序的！
//        cities.add("合肥");//自动去重
//        System.out.println(cities);
//        System.out.println(cities.size());


        //可以通过重写类的HashCode方法来改变判断
//        HashSet<HashCrack> set2 = new HashSet<>();
//        set2.add(new HashCrack("合肥"));
//        set2.add(new HashCrack("合肥"));
//        System.out.println(set2.size());

        HashSet<String> hashSet = new HashSet<>();
        String s1 = "BB";
        String s2 = "Aa";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
