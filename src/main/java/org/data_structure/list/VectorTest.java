package org.data_structure.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * vector 底层也是数组实现，与ArrayList不同的是，虽然虽然初始大小都是10，但vector是2倍扩容
 * vector线程同步、线程安全，相较于ArrayList牺牲了性能
 * */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("鄱阳湖");vector.add("洞庭湖");vector.add("洪泽湖");vector.add("太湖");
        ListIterator<String> iterator = vector.listIterator();
        /**使用ListIteration迭代器时可以进行有规矩的增删,改*/
        while(iterator.hasNext()){
            String str = iterator.next();
            if(str == "鄱阳湖") iterator.set("鄱阳湖湖");
        }
        System.out.println(vector);
    }
}
