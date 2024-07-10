package ChatTest;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<Socket> ServerSocketList = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        // 如何实现多个客户端之间的信息互传呢？
//        用服务端作为中转站，每次接受到的socket对象，不在服务端展示发送的各种信息，
//        而是在服务端，将收到的每一个socket对象，统一管理，将信息展示在每一个client端
        System.out.println("==============服务器=============");
        ServerSocket serverSocket = new ServerSocket(8888);
//        阻塞等待客户端的连接请求，一旦与某个客户端链接成功，则返回服务端这边的socket对象

        while (true) {//不断的接受新的客户端tcp请求
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+"上线了");

            new ServerThread(socket).start();
        }
    }
}
