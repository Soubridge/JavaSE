package org.io.bytestream;

import java.io.*;

public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        String pathname1 = "C:\\Users\\v_luoshenglu_dxm\\Desktop\\a.txt";
        String pathname2 = "C:\\Users\\v_luoshenglu_dxm\\Desktop\\abc.txt";

        File file1 = new File(pathname1);
        File file2 = new File(pathname2);

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2, true);

        byte[] bytes = new byte[5];
        int len = fis.read(bytes);
        while(len != -1){
            fos.write(bytes,0,len);
            len = fis.read(bytes);
        }
        fis.close();
        fos.close();
    }
}
