package org.ioplus.object_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 * ObjectOutputStream:将实例(对象)写在文件中永久存储
 * ObjectInputStream:将写在文件中的实例读到内存中
 * PS：只有实现了Serializable可序列化接口的类才可以将实例写出到文件中，永久保存
 *      若某些属性不需要序列化，需要注明是瞬态的，用transient修饰，解冻拿到后这个属性的值为null
 * */
public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\goods.txt");
        ObjectOutputStream out = new ObjectOutputStream(fos);

        Goods goods = new Goods("Dell G3",5555.5, 25);
        out.writeObject(goods);
        out.close();
    }
}
