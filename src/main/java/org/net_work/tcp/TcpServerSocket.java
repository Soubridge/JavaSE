package org.net_work.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);

        //接收一个客户端访问连接，如果没有客户端连接，会在这一直阻塞
        Socket client = serverSocket.accept();
        //InetAddress localhost = client.getInetAddress();
        //String ip_hostAddress = localhost.getHostAddress();

        InputStream is = client.getInputStream();
        OutputStream os = client.getOutputStream();

        byte[] data = new byte[1024];
        int len = is.read();
        System.out.println("接收到客户端信息：" + new String(data,0,len));

        os.write("我在".getBytes());
        client.close();
        serverSocket.close();
    }
}
