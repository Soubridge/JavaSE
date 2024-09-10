package org.ioplus.conversion_stream;

import java.io.*;

/**
 * InputStreamReader 读入的字节流按照指定的编码规则解码成字符流
 *
 *InputStreamReader、FileReader 同属于字符流读入超类Reader的子类
 * FileReader是按编译器默认的字符集进行读入字符，如果读入的文本编码方式和编译器字符集不同，则会出现乱码的问题
 * InputStreamReader(FileInputStream fis，charset "UTF-8") 可以根据指定字符集的规则对读入的字节进行解码
 * 按理说InputStreamReader是Reader的子类应该是，读入字符流才对，为啥一个读入字节流转成字符流的要归到这？
 *      实际上，读入的确实是字符流，比如UTF-8格式下，汉字三个字节，那么可以用形参中的fis连读三个字节，然后把这三个字节拿来用UTF-8的规则解码
 *      这样总的功能还是读入的字符流，FileInputStream只是一个借助工具而已
 * */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\b.txt");
        InputStreamReader isr = new InputStreamReader(fis,"GB18030");
        int read = isr.read();
        while(read != -1){
            System.out.print((char) read);
            read = isr.read();
        }
        isr.close();
    }
}
