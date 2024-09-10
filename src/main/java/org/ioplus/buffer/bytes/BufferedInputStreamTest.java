package org.ioplus.buffer.bytes;

import java.io.*;
/**
 *内置8192字节(4M)的读写缓冲区
 * 普通流copy：fis先从磁盘文件中读出一个字节，把这个字节赋值给main中的变量，再把这个变量用fos写入新的磁盘文件中，即有文件有多少字节就需要多少次读写
 * 缓冲流copy：Reader:会首先从文件读8192个字节到缓存区，然后bis.read的时候会从这个缓冲区拿走一定的量的数据，知道这个缓冲区的文件被拿完了，然后从源文件再搬8192字节过来
 *           Writer:会有一个8192字节的缓存区，会不断接受来自main中writer的字节，等攒满8192字节后一块写入文件
 **/
public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Anaconda3\\_conda.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\MyConda.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long startTime = System.currentTimeMillis();

        //使用普通字节流单个字节复制，所需时间为122s
//        int read = fis.read();
//        while(read != -1){
//            fos.write(read);
//            read = fis.read();
//        }
        //使用缓冲字节流单个字节复制，所需时间为536ms
        int read = bis.read();
        while(read != -1){
            bos.write(read);
            read = bis.read();
        }

        System.out.println("所需的时间为：" + (System.currentTimeMillis()-startTime));
    }
}
