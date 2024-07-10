package Demo1.UDP1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws Exception {

        //实现UDP通信 的一发一收， udp不可靠连接

        //创建udp客户端对象
        DatagramSocket socket = new DatagramSocket();
        System.out.println("客户端启动成功！");

        //创建要发送的数据包
        byte[] buffer = "Hello,我是小明。".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 6666);
         socket.send(datagramPacket);
        System.out.println("客户端数据发送完毕！");
        // 关闭通信
         socket.close();
    }
}
