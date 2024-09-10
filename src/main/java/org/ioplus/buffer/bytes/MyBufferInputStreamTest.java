package org.ioplus.buffer.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyBufferInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\a.txt");
        MyBufferedInputStream mbis = new MyBufferedInputStream(fis);

        byte[] bytes = new byte[200];

        int len = mbis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));
    }
}
