package org.digui;

import java.util.Scanner;

public class Nsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(my_sum(n));
        System.out.println(n*(n+1)/2);
    }

    public static int my_sum(int n){
        if(n == 1) return 1;
        return n + my_sum(n-1);
    }
}
