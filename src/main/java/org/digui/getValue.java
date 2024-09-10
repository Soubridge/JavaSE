package org.digui;

import java.util.Scanner;

public class getValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(chengfa(n));

    }
    public static int chengfa(int n){
        if(n == 1) return 1;
        return n * chengfa(n-1);
    }
}
