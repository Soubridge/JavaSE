package org.io.bytestream;

import java.io.*;

/**
 * OutputStream常用方法：.close() .write() .flush()
 *
 * FileOutputStream是字节输出流OutputStream的一个子类，可以将数据从内存写出到文件
 * 构造方法FileOutputStream(File file) FileOutputStream(String pathname)
 * 如果指定文件存在，则会把文件内容清空然后写出到文件中、如果pathname文件不存在，则会创建并将字节流写入
 * 用os.write(b:)写入： ①一个字节的写、②字节组全写、③字节串截取 os.writer(bytes,offset,length)写入 字符串.getBytes()可获得Byte[]
 * 可以看出os.write(int),也可以收int作为参数，int是四字节，但写出的话只能一个字节往文件中写，所以若n>=256，只要int后8位(b)所对应的ASCII码字符
 * ASCII(0~255) byte(-128~127), 如果给的参数直接是byte只能映射ASCII的0~127，所以给的int类型取后8位(0~255)
 *
 * FileOutputStream(File file),默认是把原内容删了然后加内容，加个boolean参数可以实现追加数据FileOutputStream(File file, boolean append)
 * 换行：加 "\n".getBytes(),按理说应该是"\r"+"\n",即 到行首+到下一行,但是只写"\n"或"\r"也能达到效果，编译器帮补了
 * utf-8的编码格式中，一个汉字占三字节，一句话转字节流后用③的方法，若截取的不是三的整数倍，则会出现乱码的问题
 * */
public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\v_luoshenglu_dxm\\Desktop\\a.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(file);

        /*OutputStream os = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\a.txt");

        os.write(72);  //H
        os.write(101);  //e
        os.write(108);  //l
        os.write(108);  //l
        os.write(111);  //o
        os.write(32);  //空格
        os.write(87);  //W
        os.write(111); //o
        os.write(114);  //r
        os.write(108); //l
        os.write(100); //d
        os.write(33);  //!

        byte[] bytes = {72,101,108,108,111,32,87,111,114,108,100,33};
        OutputStream os1 = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\b.txt");
        os1.write(bytes);*/

        //获取字节流
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\b.txt",true);
//        byte[] date = "，有点想家了".getBytes();
//        fos.write(date);
//        fos.close();
        //换行"\n",从这里也可以看出默认清空源文件内容是，是在new FileOutputStream()的时候出现的，不是write过程中出现的
        FileOutputStream fos = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\c.txt",true);
        byte[] bytes = "\r\n".getBytes();
        for(int i=97; i<=101; i++){
            fos.write(i);
            fos.write(bytes);
        }
        fos.close();
    }
}
