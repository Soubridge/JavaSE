package org.data_structure.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        //这里用collection的.add方法添加
        cities.add("山东");
        cities.add("河南");
        cities.add("河北");
        //可以看到ArrayList的在数组中的排放顺序是根据.add添加顺序来的
        System.out.println(cities.get(0));
        //这里用的List接口的方法[boolean]，可以在指定位置插入数据
        cities.add(1,"山西");
        /**从删除可以看出List实际上就是动态数组！！！*/
        System.out.println(cities.remove(1)+"已经被删除");
        System.out.println(cities.get(1));
        System.out.println("已经将"+cities.set(2,"北京")+"替换成北京");

//        List<String> list = new ArrayList<>();
//        list = cities.subList(1,3);
//        for(String ll : list){
//            System.out.println(ll);
//        }
        /**ListIterationList集合的迭代器
         * 不同于iteration只能用remove，ListIteration迭代器.add和.remove都可以用，这得益于动态列表List是有序的？
         *而且ListIteration是可以向前或则向后扫的！，iteration只能向后扫
         * */
        ListIterator<String> iterator = cities.listIterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            if(str == "山东")
                //在该元素后面添加，且本次的迭代循环不会扫到刚刚添加的元素
                iterator.add("济南");
            if(str == "北京")
                iterator.remove();//list的迭代器删除不必写参数，删除当前扫到的这个！
        }
        for(String city : cities) System.out.println(city);
    }
}
