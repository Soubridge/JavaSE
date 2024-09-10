package org.net_work.Ex.up_image.udp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendTest {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        FileInputStream fis = new FileInputStream("C:\\Users\\v_luoshenglu_dxm\\Desktop\\water.jpg");
        byte[] data = new byte[8192];
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("localhost"), 8016);

        int len = fis.read(data);
        while(len != -1){
            packet.setData(data);
            packet.setLength(data.length);
            socket.send(packet);
            len = fis.read(data);
        }
        //结束时要发一个空报文作为结束标识
        packet.setLength(0);
        socket.send(packet);

        fis.close();
        socket.close();
    }
}
