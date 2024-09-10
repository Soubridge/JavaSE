package org.net_work.udp;

import java.io.IOException;
import java.net.*;

public class DatagramSocketTest {
    public static void main(String[] args) throws IOException {
         //用datagramSocket发送处理好的报文
        DatagramSocket socket1 = new DatagramSocket();
        byte[] data1 = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(data1,data1.length, InetAddress.getByName("localhost"),6969);

        //可以先创建好报文packet，然后用setXX来调整参数，也可以先写好data...
        packet1.setData("你好".getBytes());
        packet1.setLength("你好".getBytes().length);
        socket1.send(packet1);
        socket1.close();

        //用datagramSocket接收处理好的报文，.receive(packet)不必自行设置循环，它会自动循环监听
        DatagramSocket socket = new DatagramSocket(6969);
        byte[] data = new byte[8192];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        socket.receive(packet);
        socket.close();
        System.out.println("接收到数据" + new String(data,0,packet.getLength()));
    }
}
