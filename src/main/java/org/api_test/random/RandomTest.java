package org.api_test.random;
import java.util.Random;
import java.util.Scanner;
/**
 * 产生随机数
 * */

public class RandomTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入最大值：");
        int max = scanner.nextInt();
        System.out.println("输入产生随机数的个数");
        int n = scanner.nextInt();

        Random random = new Random();
        for(int i=1; i<=n; i++) {
            int num = random.nextInt(max);
            System.out.println(num);
        }
    }
}
