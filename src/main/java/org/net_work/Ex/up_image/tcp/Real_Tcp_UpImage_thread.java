package org.net_work.Ex.up_image.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Real_Tcp_UpImage_thread {
    public static void main(String[] args) throws IOException {
        Thread host_thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Socket localhostSocket = new Socket("localhost", 8086);
                    OutputStream os = localhostSocket.getOutputStream();
                    FileInputStream fis = new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\water.jpg");
                    byte[] data = new byte[8192];
                    int len = fis.read(data);
                    while(len != -1){
                        os.write(data);
                        len = fis.read(data,0,len);
                    }
                    fis.close();
                    localhostSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        host_thread.start();

        ServerSocket serverSocket = new ServerSocket(8086);
        Socket client = serverSocket.accept();
        System.out.println("建立连接成功");
        InputStream is = client.getInputStream();
        byte[] data = new byte[1024];
        int len = is.read(data);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\water_copy.jpg");
        while(len != -1){
            fos.write(data,0,len);
            len = is.read(data);
        }
        fos.close();
        client.close();
    }
}
