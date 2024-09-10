package org.net_work.Ex.up_image.udp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\water_copy.jpg");

        byte[] data = new byte[8192];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        DatagramSocket socket = new DatagramSocket();


        while(true){
            socket.receive(packet);
            int len = packet.getLength();
            if(len == 0) break;
            fos.write(data,0,len);
        }
        fos.close();
        socket.close();
    }
}
