package ChatTest;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientThread extends Thread{
    private Socket socket;

    public ClientThread(Socket socket) {
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
                } catch (Exception e) {
                    System.out.println(socket.getRemoteSocketAddress()+ "我。。。离线了");
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
