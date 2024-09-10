package org.api_test.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int a1 = scanner.nextInt();
        System.out.println("输入第二个数：");
        int a2 = scanner.nextInt();
        System.out.println("输入第三个数：");
        int a3 = scanner.nextInt();

        if(a1>a2) {
            System.out.println("最大值是：" + (a1 > a3 ? a1 : a3));
        }else{
            System.out.println("最大值是：" + (a2>a3?a2:a3));
        }
    }
}
