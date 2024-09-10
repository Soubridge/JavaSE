package org.ioplus.buffer.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/**
 * 这里是用滑动窗口的思想搬数据的，也只有简单实现了缓冲流(Buffer)的思想，所需时间为42ms
 * 比真正的BufferedInputStream、BufferedOutputStream的540ms还要快，说明真正的Buffer流实现是要更复杂
 * */

public class WindowBufferedTest {
    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();

        try(
                FileInputStream fis = new FileInputStream("D:\\Anaconda3\\_conda.exe");
                FileOutputStream fos = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\MyConda.exe")
        ){
            byte[] bytes = new byte[8192];
            int len = fis.read(bytes);
            while(len == 8192){
                fos.write(bytes);
                len = fis.read(bytes);
            }
            fos.write(bytes,0,len);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("所需时间为：" + (System.currentTimeMillis()-startTime));
    }
}
