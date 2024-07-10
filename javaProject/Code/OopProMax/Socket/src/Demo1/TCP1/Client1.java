package Demo1.TCP1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========客户端1==========");
        //TCP通信，面向链接的可靠传输

        // 创建TCP通信通道
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        OutputStream os = socket.getOutputStream();//获得一个原始的输入流
        // 为了方便写入，将原始流包装为数据流
        DataOutputStream dos = new DataOutputStream(os);

       while (true){
        String re = scanner.nextLine();
           if (re.equals("exit")){
            System.out.println("欢迎下次光临");
            dos.close();
            socket.close();
            break;
        }
        dos.writeUTF(re);
        }
       }

    }

