package org.api_test.object;

/**
 * 直接输出实例的话，是默认调用.toString()方法的，默认是【类别+@+地址】看有没有重写toString了
 * */
public class MainObjectTest {
    public static void main(String[] args) {
        Person lzssl = new Person("lzssl", 23);
        System.out.println(lzssl);

//        /**Object.equals默认比较地址是否相同(高规格),可以重写手动把它做成比成员的*/
//        Person lzssl1 = new Person("lzssl", 23);
//        System.out.println(lzssl.equals(lzssl1)); //false
//        Person lzssl2 = lzssl;
//        System.out.println(lzssl.equals(lzssl2)); //true

    }
}
