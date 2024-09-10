package org.classloader.loader_time;

import org.junit.Test;
/**
 * 类加载的时机：
 *      ① main方法所在的类首先被加载到内存
 *      ② new 实例的时候，类会被加载到内存   [若有父类，先加载父类]
 *      ③ 调用静态成员(类属性、类方法)时     [若有父类，先加载父类]
 *      ④ 使用CLass.forName(xx)时        [若有父类，先加载父类]
 * 不管什么方法加载，类只需要加载一次(如果需要某个类 而内存中没有才需要去加载)
 * */
public class LoaderTest {
    static {
        System.out.println("main loader...");
    }

    @Test
    public void test1() throws ClassNotFoundException {
        new B();
        //Integer num = B.num;
        Class<?> bClass = Class.forName("org.classloader.loader_time.B");
    }
}
