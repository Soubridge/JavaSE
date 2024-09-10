package org.net_work.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpHostSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6666);
        //和UDP可以写报文不同，TCP的传输是通过字节流的方式进行的,用户端可以用socket.get(IO)获取输入输出流，然后再输入输出流中进行信息的发送与接收
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        //用的os的write方法，直接往字节写入流中写内容，既可实现向服务器发送内容
        os.write("你好，服务器".getBytes());

        //同样用is.read()读取服务器发来的信息，如果收不到会在.read处一直阻塞线程执行
        byte[] data = new byte[1024];
        int len = is.read(data);
        System.out.println("接收到来自服务器的信息：" + new String(data,0,len));
        socket.close();
    }
}
