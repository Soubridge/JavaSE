package org.api_test.scanner;
/**
 * scanner.next()遇到空白符或者读完数据结束
 * scanner.nextLine()遇到回车"/r"时或者读完数据结束
 * Ps：如果用的.next()输入，最后是回车结束，.next()
 * */

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //请输入”lala ss“对下面的内容进行测试
        System.out.println("请输入一段字符串(next)：");
        String str = in.next();
        System.out.println(str);

        System.out.println("next数据接受完成");

        System.out.println("请输入一段字符串(nextLine)：");
        String str1 = in.nextLine();
        System.out.println(str1);
    }
}
