package org.data_structure.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetAndLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("合肥");set1.add("南昌");set1.add("武汉");set1.add("郑州");
        System.out.println(set1);   //[合肥, 郑州, 武汉, 南昌]
                                    //hashSet的存取顺序不是一致的，是根据hashCode得到的

        Set<String> set = new LinkedHashSet<>();
        set.add("合肥");set.add("南昌");set.add("武汉");set.add("郑州");
        System.out.println(set);    //[合肥, 南昌, 武汉, 郑州]
                                    //LinkedHashSet在原本的HashSet上加了个双向链表存储存放顺序，读取的时候也是有序的(根据存放顺序)
    }
}
