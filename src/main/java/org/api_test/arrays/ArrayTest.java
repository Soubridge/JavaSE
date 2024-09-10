package org.api_test.arrays;


import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {11,13,17,19,22,31};
        Arrays.sort(arr);
        //二分法查元素(保证有序)，找到返回位置，找不到返回-index-1,index为应插入下标
        //System.out.println(Arrays.binarySearch(arr,18));

        int[] arr2 = Arrays.copyOf(arr,2);
        String arrStr = Arrays.toString(arr2);
        System.out.println(arrStr);

        System.out.println(Arrays.equals(arr,arr2));
    }
}
