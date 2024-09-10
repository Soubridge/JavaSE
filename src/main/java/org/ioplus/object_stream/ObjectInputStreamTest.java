package org.ioplus.object_stream;

import java.io.*;
/**
 * 原理是 会和类的.class文件进行对比，如果.class在序列化后发生了变化，之前序列化的文件反序列化会失败，因为版本号发生了改变，抛出InvalidClassException异常
 * 可以通过在类中写死序列化版本号来避免这个问题, private static final serialVersionUID = 1L;这样.get新加的属性时也会返回null
 *
 * */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\goods.txt");
        ObjectInputStream in = new ObjectInputStream(fis);

        Goods goods = (Goods) in.readObject();
        System.out.println(goods.getBand());
    }
}
