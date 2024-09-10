package org.net_work.udp;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * DatagramPacket 封装UDP报文的类，参数：byte[] data、 int length、 InetAddress address、 Int port
 *                                   负载数据       数据长度(字节)   目标ip用InetAddress封装    端口
 * 方法: .getData() .getLength()  .getAddress() .getPort 返回值类型对应参数的类型
 */
public class DatagramPacketTest {
    public static void main(String[] args) throws UnknownHostException {
        DatagramPacket packet = new DatagramPacket(
                "abc".getBytes(),
                "abc".getBytes().length,
                InetAddress.getByName("localhost"),
                8989
        );
        //用于接收UDP报文
        byte[] data = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(
                data,
                data.length
        );

        System.out.println(new String(packet.getData()));
        System.out.println(packet.getLength());
        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(packet.getPort());
    }
}
