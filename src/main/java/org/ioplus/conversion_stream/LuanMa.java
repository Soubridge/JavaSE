package org.ioplus.conversion_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * 如果文本的编码格式和IDEA的不同，则读取出来会是乱码
 * */
public class LuanMa {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\v_luoshenglu_dxm\\Desktop\\b.txt");
        int read = fileReader.read();
        while(read != -1){
            System.out.print((char) read);
            read = fileReader.read();
        }
    }
}
