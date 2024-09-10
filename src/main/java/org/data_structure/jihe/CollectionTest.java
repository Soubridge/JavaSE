package org.data_structure.jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
//        Collection<String> cities = new ArrayList<>();
//
//        cities.add("陕西西安");
//        cities.add("山西太原");
//        System.out.println(cities);
//
//        System.out.println(cities.contains("陕西西安"));
//        cities.remove("陕西西安");
//        System.out.println(cities);
//        System.out.println(cities.contains("陕西西安"));
//        cities.add("山东济南");
//
//        System.out.println("现在有"+cities.size()+"个元素");
//
//        Object[] objects = cities.toArray();
//        for(int i=0; i< cities.size(); i++)
//            System.out.println(objects[i]);
//
//        cities.clear();
//        System.out.println(cities.isEmpty());

        //foreach循环
//        String[] cities = {"山东济南","山西太原","河北石家庄","河南郑州","甘肃兰州"};
//        for(String city : cities){
//            System.out.println(city);
//        }
//        Collection<String> cities = new ArrayList<>();
//        cities.add("山东济南");
//        cities.add("山西太原");
//        cities.add("河北石家庄");
//        cities.add("甘肃兰州");
//        //即使是动态数组，foreach每个单独的元素的类型也要看集合集体的类型是啥
//        //foreach迭代器进行集合迭代时，不能对集合进行增删操作！！！
//        for(String city : cities){
//            System.out.println(city);
//        }
        //Iterator迭代器接口,迭代过程中同样也不能进行数据的增加，删除方面不能用自己的删除，可以用iterator.remove;
        Collection<String> cities = new ArrayList<>();
        cities.add("山东济南");
        cities.add("山西太原");
        cities.add("河北石家庄");
        cities.add("甘肃兰州");
        Iterator iterator = cities.iterator();
        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}
