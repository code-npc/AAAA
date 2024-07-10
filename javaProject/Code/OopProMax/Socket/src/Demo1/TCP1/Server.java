package Demo1.TCP1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    /**
     *
     * 如何让服务端支持多个客户端，同时使用？？？？
     * 用线程，主线程用来接受和连接客户端
     * 子线程，用来做具体的数据处理
     */

    public static void main(String[] args) throws Exception {
        System.out.println("========服务端==========");

        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            Socket socket = serverSocket.accept();//阻塞等待客户端的连接请求，一旦与某个客户端链接成功，则返回服务端这边的socket对象
            System.out.println(socket.getRemoteSocketAddress()+"上线了");

            new TcpThread(socket).start();
        }

    }
}
