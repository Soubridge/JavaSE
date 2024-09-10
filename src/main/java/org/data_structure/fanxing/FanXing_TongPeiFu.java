package org.data_structure.fanxing;

/**
 * 泛型作为方法的形参时，也可以用通配符来增加适配性
 * */
public class FanXing_TongPeiFu {

    public static void main(String[] args) {
        GetClass<Number> t1 = new GetClass<>();
        test1(t1);

        GetClass<Integer> t2 = new GetClass<>();
        //这个写法是不行的，因为test方法在接受形参的时候已经明确说明了所要泛型的具体类型
        //test1(t2);
        //这样就可以了，没有明确形参的泛型类型
        test2(t1);
        test2(t2);
    }
    public static void test1(GetClass<Number> t){
        Number number = t.getE();
        System.out.println("test1...");
    }
    public static void test2(GetClass<?> getClass){
        Object o = getClass.getE();
        //后面需要接强制类型转换
        System.out.println("test2...");
    }
}
