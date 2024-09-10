package org.net_work.udp;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * InetAddress类可以通过域名或地址[.getByName,.getByAddress(均为类方法)]获得对应的主机对象
 * 方法：host.getName() 返回主机名(域名),host.getAddress() 返回ip地址字节标识，host.getHostAddress()返回ip标准String格式
 * */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localhost = InetAddress.getByName("localhost");
        String hostName = localhost.getHostName();
        String hostAddress = localhost.getHostAddress();

        System.out.println(hostName + ":" + hostAddress);

//        InetAddress baidu = InetAddress.getByName("www.4399.com");
//        System.out.println(baidu.getHostName());
//        System.out.println(baidu.getHostAddress());
//        byte[] bytes = baidu.getAddress();
//        for(byte b : bytes){
//            System.out.println(b);
//        }

    }
}
