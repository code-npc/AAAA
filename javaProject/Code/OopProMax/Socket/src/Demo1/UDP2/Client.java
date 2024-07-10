package Demo1.UDP2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //实现UDP通信 的多发多收， udp是不可靠连接

        //创建udp客户端对象
        DatagramSocket socket = new DatagramSocket();
        System.out.println("客户端1启动成功！");

        //创建要发送的数据包
        while (true){
            String s = scanner.nextLine();
            if (s.equals("exit")){
                break;
            }else {
                byte[] buffer = s.getBytes();
                DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 6666);
                socket.send(datagramPacket);
                System.out.println("客户端数据发送完毕！");
            }
        }

        // 关闭通信
         socket.close();
    }
}
