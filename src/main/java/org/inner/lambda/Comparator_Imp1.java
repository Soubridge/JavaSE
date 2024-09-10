package org.inner.lambda;

public class Comparator_Imp1 implements Comparator{
    public String comparator(int a1, int a2){
        if(a1 == a2) return "俩数一样大";
        else {
            return a1>a2 ? "第一个数大" : "第二个数大";
        }
    }
}
