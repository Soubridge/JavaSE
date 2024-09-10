package org.io.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *字符流文件自能用于copy文本类型的文件，字节流可以文本也可以非文本
 * */
public class FileCopyTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\v_luoshenglu_dxm\\Desktop\\出师表.txt");
        FileWriter fileWriter = new FileWriter("C:\\Users\\v_luoshenglu_dxm\\Desktop\\f.txt");

        char[] chars = new char[10];
        int len = fileReader.read(chars);
        while(len == 10){
            fileWriter.write(chars);
            fileWriter.flush();
            len = fileReader.read(chars);
        }
        fileWriter.write(chars,0,len);
        fileReader.close();
        fileWriter.close();
    }
}
