package org.reflect.classloader;
/**
 * 类加载器(ClassLoader),作用是把.class文件动态加载到内存中，共有三种类加载器，可用.getClassLoader()获得
 * BootStrap Classloader(引导类加载器)  加载JRE_HOME/lib下的用c++写的类库，太过核心 应用程序无法获得
 * Extension ClassLoader(扩展类加载器)  加载JRE_HOME/lib/ext下的类库，是bootstrap的子加载器，开发者可以直接获得
 * App ClassLoader(系统类加载器)        加载classpath路径下所有的jar和class文件
 *
 * 获得类加载器后可以通过类加载器的.getResourceAsStream("name")或者src结构下resource文件夹下的文件
 * */
import com.sun.java.accessibility.AccessBridge;
import org.net_work.tcp.TcpHostSocket;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassLoaderTest {
    public static void main(String[] args) throws IOException {
        //ClassLoader bootStrapClassLoader = Object.class.getClassLoader();

        //ClassLoader extClassLoader = AccessBridge.class.getClassLoader();

        //ClassLoader appClassLoader = TcpHostSocket.class.getClassLoader();

        //System.out.println(bootStrapClassLoader);
        //System.out.println(extClassLoader);
        //System.out.println(appClassLoader);

        ClassLoader loader = ClassLoaderTest.class.getClassLoader();
        //实际上以字节缓冲流BufferedInputStream进行返回
        BufferedInputStream bis = (BufferedInputStream) loader.getResourceAsStream("cate.txt");
        InputStreamReader isr = new InputStreamReader(bis);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        while(str != null){
            System.out.println(str);
            str = br.readLine();
        }
        br.close();
        /*char[] chars = new char[5];
        int len = isr.read(chars);
        while(len != -1){
            System.out.print(new String(chars,0,len));
            len = isr.read(chars);
        }*/
        isr.close();
    }
}
