package org.net_work.Ex.up_image.tcp;

import sun.net.util.IPAddressUtil;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ui_server {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\water_copy.jpg");

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket client = serverSocket.accept();
        System.out.println(client.getInetAddress() + "连接成功");

        InputStream is = client.getInputStream();
        byte[] data = new byte[8192];
        int len = is.read(data);
        while(len != -1){
            fos.write(data,0,len);
            len = is.read(data);
        }
        fos.close();
        client.close();
        serverSocket.close();
    }
}
