package ChatTest;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            Server.ServerSocketList.add(socket);//将当前socket对象放入集合中
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                try {
                    String res = dis.readUTF();
                    System.out.println(res);
//                    遍历每一个在线的socket对象，并将消息发送出去
                    for (Socket socket1 : Server.ServerSocketList) {
                        OutputStream os = socket1.getOutputStream();
                        DataOutputStream dos = new DataOutputStream(os);
                        dos.writeUTF(res);
                        dos.flush();
                    }
                } catch (Exception e) {
                    for (Socket socket1 : Server.ServerSocketList) {
                        OutputStream os = socket1.getOutputStream();
                        DataOutputStream dos = new DataOutputStream(os);
                        dos.writeUTF(socket1.getRemoteSocketAddress()+"离线了");
                        dos.flush();
                    }
                    System.out.println(socket.getRemoteSocketAddress()+ "离线了");
                    Server.ServerSocketList.remove(socket);//离线后将该对象从队列中移除
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
