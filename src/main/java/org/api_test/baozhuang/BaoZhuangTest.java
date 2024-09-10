package org.api_test.baozhuang;

public class BaoZhuangTest {
    public static void main(String[] args) {
        Integer num = 25;
        String s = num + ""; //任何类型的转String，只需要在后面加空白字符“”;

        String str = "25";
        Integer num1 = Integer.parseInt(str);  //可以用各种包装类的静态方法把str转成各种类型,主要数int->string
        System.out.println(num1);
    }
}
