package org.ioplus.conversion_stream;

import java.io.*;
/**
 * 源文件-->编译器(内存)-->写出文件
 * GB18030-->UTF-8-->UTF-8
 *
 * InputStreamReader(fis,charset)、OutputStreamWriter(fos,charset)是为了解决读入、写出文件和编译器默认编码不同而搞的字符输入输出类，这样可以提高程序的移植性
 * InputStreamReader会要一个"字节读入器"fis和源文件的字符集charset，根据charset可以知道一次读几个字节可以按charset解码成一个字符
 *                  这个解码的字符会以编译器默认的字符集编码提升为int类型，或者返回chars组
 * OutputStreamReader会要一个"字节写入器"fis和写出文件的字符集charset，根据charset可以知道一次要写入几个字符
 *                  编译器会将内存中的字符[int(编译器编码规则提升)、chars]先按写入文件的字符集解码成字节，然后写入
 * */

public class OutputStreamWriterTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\b.txt");
        InputStreamReader isr = new InputStreamReader(fis, "GB18030");

        OutputStream fos = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\f.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

//        int read = isr.read();
//        while(read != -1){
//            osw.write(read);
//            System.out.print((char) read);
//            read = isr.read();
//        }
        char[] chars = new char[3];
        int len = isr.read(chars);
        while(len == 3){
            osw.write(chars);
            osw.flush();
            len = isr.read(chars);
        }
        osw.write(chars,0,len);
        isr.close();
        osw.close();
    }
}
