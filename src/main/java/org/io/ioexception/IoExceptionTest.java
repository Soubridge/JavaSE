package org.io.ioexception;

import org.io.charstream.FileWriterTest;

import java.io.*;
/**
 * 可以把流的创建写在try(...)中，执行完try(){...}中的代码后会自动关闭流，即使出现异常也会关闭流
 * 如果创建流时就出现异常，流创建失败也不会再调用.close()方法了
 * */

public class IoExceptionTest {
    public static void main(String[] args) {
        try(
            InputStream is = new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\b.txt");
            OutputStream os = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\f.txt");
         ) {
            byte[] bytes = new byte[5];
            int len = is.read(bytes);
            while(len == 5){
                os.write(bytes);
                len = is.read(bytes);
            }
            os.write(bytes,0,len);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
