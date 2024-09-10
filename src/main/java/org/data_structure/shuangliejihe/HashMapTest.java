package org.data_structure.shuangliejihe;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<City, Integer> map = new HashMap<>();
        //默认hashCoed使用key的地址计算，重写后用province和name，重写后equals也是比较province&name是否相等
        //不重写equals也是直接对比key(City)的地址是否相等
        map.put(new City("山东","济南"),1);
        map.put(new City("山东","济南"),2);
        System.out.println(map);
    }
}
