package OutputStream;

import java.io.*;

public class CoppyFile {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:\\Users\\HP\\Pictures\\常用图片\\1_clear.png");

        OutputStream os = new FileOutputStream("D:\\Edge浏览器下载位置\\1_clear.png",true);

        byte[] buffer = new byte[1024];

        int len;
        while ((len = is.read(buffer)) != -1){
            os.write(buffer);
        }

        os.close();
        is.close();
    }
}
