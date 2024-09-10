package org.morethread.threadsafe.synchronizeds;
/**
 * 获取类的字节码(类在加载时，由JVM自动创建的.class文件，和对象(实例)无关，只和类本身有关系)的三种方式
 * 类的字节码是唯一的，所以用在锁同步代码块上是非常合适的，肯定能确定是唯一的对象
 * */
public class Get_ZiJieMa {
    public static void main(String[] args) throws ClassNotFoundException {
        //直接用类名获取
        Class<String> c1 = String.class;
        //用类的对象获取
        String str = new String();
        Class<? extends String> c2 = str.getClass();
        //直接找这个.class的文件
        Class<?> c3 = Class.forName("java.lang.String");

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
    }
}
