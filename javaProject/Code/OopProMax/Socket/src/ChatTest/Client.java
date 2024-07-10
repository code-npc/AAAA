package ChatTest;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("===========聊天窗口============");
        Scanner scanner = new Scanner(System.in);
        // 获取socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);

//        为了将客户端改装为既能发送消息，又能接受消息的对象// 相当与这个客户端有一个线程是用来接受消息，主线程用来发送消息。
        new ClientThread(socket).start();

        // 获取io通道，并包装
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        // 写入
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("exit")){
                System.out.println("欢迎下次光临！");
                dos.close();
                socket.close();
                break;
            }else {
                dos.writeUTF(s);
            }
        }

    }
}
