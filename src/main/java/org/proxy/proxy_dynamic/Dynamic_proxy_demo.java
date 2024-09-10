package org.proxy.proxy_dynamic;

import java.lang.reflect.Proxy;

public class Dynamic_proxy_demo {
    public static void main(String[] args) {
        //先搞一个目标对象(原始对象)
        FangDong fangDong = new FangDong();

        //代理对象proxy增强型的对象,使用Proxy.newProxyInstance(x,x,x)可以获得按接口(约定)增强的代理类(中介)
        /**参数为
         * loader : 目标对象的加载器
         * interfaces : 目标对象实现的所有接口
         * InvocationHandler h : 这是一个接口，可以传一个匿名内部类作为实现类，重写其中的方法(invoke)，也可以传它的一个实现类
         * */
        HeTong proxy = (HeTong) Proxy.newProxyInstance(
                FangDong.class.getClassLoader(),         //获取目标对象的类加载器
                FangDong.class.getInterfaces(),         //获取目标对象实现的所有接口
                new ProxyHouseInvocationHandler(fangDong)  //使用代理对象调度器(处理程序)
        );
        proxy.HaiJingFang();
    }
}
