package org.data_structure.set;
/**
 * TreeSet需要注意的是，所存储的 元素类 必须实现Comparable接口的compareTo函数，因为确定放到哪里需要进行比较
 * */
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("小红",20));
        treeSet.add(new Person("小黄",18));
        treeSet.add(new Person("小蓝",16));
        System.out.println(treeSet);
    }
}
