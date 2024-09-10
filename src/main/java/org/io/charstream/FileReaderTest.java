package org.io.charstream;

import java.io.*;
import java.util.Arrays;

/**
 * FileReader是Reader的具体实现类，用于读取文件中的字符流，对标字节流读取方法FileInputStream
 * 方法 ①fileReader.read() 读取一个字符出来，这个字符会被提升为int类型，可用char(int)强制转换，“光标”安排方法同字节流的fis.read()的处理方法，也是一直向后移动
 *     ②fileReader.read(chars) 给一个字符数组，同字节流fis.read(bytes)，这里是把字符们直接覆盖到chars字符组里，返回实际读到的有效数据的个数(Ps：数组满||字符无)
 *     ③fileReader.read(chars,offset,length)，这里是指从字符组chars的offset位置开始覆盖len个字符，同样返回实际读到的有效字符数
 *
 *     不知道为什么并没有.skip()的方法
 * */
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\v_luoshenglu_dxm\\Desktop\\b.txt");
        Reader reader = new FileReader(file);

//        int ii = reader.read();
//        while(ii != -1){
//            System.out.println( (char)ii ); //单个字符会被提升为int类型
//            ii = reader.read();
//        }

//        char[] chars = new char[20];
//        Arrays.fill(chars,'*');
//        int len = reader.read(chars); //这里chars组里默认返回的就是字符(汉字)
//        //String str = Arrays.toString(chars);
//        String str = new String(chars);
//        System.out.println("本次读取到："+len+"字符，内容是："+str);

//        char[] chars = new char[3];
//        int len = reader.read(chars);
//        while(len == 3){
//            System.out.println(Arrays.toString(chars));
//            len = reader.read(chars);
//        }
//        System.out.println(new String(chars,0,len));


        reader.close();
    }
}
