package org.inner.lambda;

public class Comparator_Imp implements Comparator{
    public String comparator(int num1, int num2){
        if (num1 == num2) return "0";
        else{
            return num1 > num2 ? "1" : "-1";
        }
    }
}
