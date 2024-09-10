package org.data_structure.set;

import java.util.HashSet;

public class IntegerHash {
    public static void main(String[] args) {
        //Integer重写了hashCode，值就是整形本身
        HashSet<Integer> hashSet = new HashSet<>();
        Integer a1 = 1;
        Integer a2 = 17;

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        hashSet.add(a2); hashSet.add(a1);
        System.out.println(hashSet);
    }
}
