package Demo1.UDP2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //服务端
        DatagramSocket socket = new DatagramSocket(6666);
        System.out.println("服务端启动成功！");
        //创建接受数据包

        while (true) {
            byte[] buffer = new byte[1024*64]; // 因为一包数据最多是64kb
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
            // 接受
            socket.receive(datagramPacket);
            // 从字节数组中，将接收到的数据打印出来
            String res = new String(buffer,0,datagramPacket.getLength());
            System.out.println(res);
            System.out.println("-------------------------");
        }
    }
}
