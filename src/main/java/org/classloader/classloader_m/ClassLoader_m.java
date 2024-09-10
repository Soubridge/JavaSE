package org.classloader.classloader_m;

import com.sun.java.accessibility.AccessBridge;
import org.classloader.loader_time.A;
import org.junit.Test;

public class ClassLoader_m {
    @Test
    public void test(){
        //Bootstrap ClassLoader 是指JAVA_HOME/lib/下的类，这些比较核心的类是不能获取它们的加载器的
        System.out.println("Bootstrap ClassLoader:" + String.class.getClassLoader());

        //ExtClassLoader ClassLoader 是指JAVA_HOME/lib/ext下的扩展类，是BootStrap的子加载器，可以由开发者直接获得
        System.out.println("ExtClassLoader ClassLoader:" + AccessBridge.class.getClassLoader());

        //AppClassLoader ClassLoader 是指系统类加载器(应用程序加载器),classpath目录下所有的jar和class文件(第三方jar)，是ExtClassLoader的子加载器
        System.out.println("AppClassLoader ClassLoader:" + A.class.getClassLoader());
    }
}
