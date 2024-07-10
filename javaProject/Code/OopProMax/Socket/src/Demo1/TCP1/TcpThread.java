package Demo1.TCP1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TcpThread extends Thread{
   private Socket socket;

    public TcpThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                try {
                    String res = dis.readUTF();
                    System.out.println(res);
                } catch (IOException e) {
                    System.out.println(socket.getRemoteSocketAddress()+"下线了");
                    dis.close();
                    socket.close();
                    break;//跳出死循环，表示不再接受这个客户端的消息
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
