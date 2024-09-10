package org.net_work.Ex.up_image.tcp;

import java.io.*;
import java.net.Socket;

public class Ui_host {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\water.jpg");
        byte[] data = new byte[8192];

        Socket socket = new Socket("127.0.0.1", 8086);
        //InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        int len = fis.read(data);
        while(len != -1){
            os.write(data);
            len = fis.read(data);
        }
        fis.close();
        socket.close();
    }
}
