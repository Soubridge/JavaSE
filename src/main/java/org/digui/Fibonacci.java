package org.digui;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n==1 || n==2)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
