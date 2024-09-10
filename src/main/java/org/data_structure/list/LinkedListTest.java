package org.data_structure.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTest {
    public static void main(String[] args) {
        //list派系的都没啥问题
//        List<String> list = new LinkedList<>();
//        list.add("山东");list.add("山西");list.add("河南");list.add("河北");
//        System.out.println(list.remove(2)+"已经被删除了");
//        System.out.println(list.set(1,"太原")+"已经被替换成太原了");
//        //采用二分查找，但是效率肯定不如ArrayList的效率
//        System.out.println(list.get(0));

        /**LinkedList不仅是List的实现类，还是Queue的实现类，有很多关于链表头尾的操作*/
        Queue<String> cities = new LinkedList<>();
        cities.offer("山西");cities.offer("陕西");cities.offer("广西");cities.offer("江西");
        System.out.println("队首元素"+cities.poll()+"已经被取出"); //队列默认从队首取值
        System.out.println(cities.peek());//取队首不删除
    }
}
