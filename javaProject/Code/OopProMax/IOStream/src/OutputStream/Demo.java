package OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo {
    public static void main(String[] args) throws Exception {
        // 掌握 如何使用文件字符输出流，FileOutputStream
        // 从内存中向硬盘中write 写

        OutputStream os = new FileOutputStream("D:\\AAAAAAAA\\javaProject\\Code\\OopProMax\\IOStream\\src\\OutputStream\\text1.txt",true);// 写入的目标文件，进行链接

        os.write(56);
        os.write('b');
        //这属于一个个的添加
        byte[] buffer = new byte[3];
        buffer[0] = 54;
        buffer[1] = 96;
        buffer[2] = 99;
        os.write(buffer);
        os.write('\n');//添加换行
        //每次都是重写，我不想，我想要每次运行后，都在原有的基础上，继续追加，


        os.close();
    }
}
