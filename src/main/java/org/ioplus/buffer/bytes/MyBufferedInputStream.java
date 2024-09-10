package org.ioplus.buffer.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyBufferedInputStream implements AutoCloseable{
    byte[] bytes = new byte[10]; //0~8191
    FileInputStream fis;
    int byte_count = 0;

    public MyBufferedInputStream(FileInputStream fis) throws IOException {
        this.fis = fis;
        byte_count = fis.read(bytes);
    }

    public int read(byte[] bs) throws IOException {
        int bs_len=bs.length;
        if(bs_len <= byte_count) {
            for (int i = 0; i < bs_len; i++) {
                bs[i] = bytes[i];
                byte_count--;
            }
            for (int i = 0; i < byte_count; i++) {
                bytes[i] = bytes[i + bs_len];
            }
            return bs_len;
        }else{
            //先把当前有的数据写入形参
            for(int i=0; i<byte_count; i++){
                bs[i] = bytes[i];
            }
            int offset = byte_count; //当前总共写入多少数据
            bs_len -= byte_count;
            //继续向源文件拿8192字节
            byte_count = fis.read(bytes);
            while(byte_count < bs_len && byte_count != -1){
                for(int i=0; i<byte_count; i++){
                    bs[offset++] = bytes[i];
                }
                bs_len -= byte_count;
                byte_count = fis.read(bytes);
            }
            if(byte_count == -1) return offset;
            else{
                for(int i=0; i<bs_len; i++){
                    bs[offset++] = bytes[i];
                    byte_count--;
                }
                return offset;
            }
        }
    }

    @Override
    public void close(){
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("关闭输入流");
    }
}
