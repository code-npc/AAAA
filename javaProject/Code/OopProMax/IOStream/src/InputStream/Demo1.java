package InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        //输入流，输出流，字节流，字符流


        // 第一个文件输入字节流 FileInputStream ，它是InputStream 类的实现类
        // read 从硬盘中读取数据到内存中，

//  不推荐第一种写法
//        InputStream is = new FileInputStream(new File("OopProMax\\IOStream\\src\\InputStream\\text1.txt"));


        //推荐下面这种写法
        // 1. 创建 与对应文件的管道（对象）
        InputStream is = new FileInputStream("D:\\AAAAAAAA\\javaProject\\Code\\OopProMax\\IOStream\\src\\InputStream\\text1.txt");

        // 2. 一个字节一个字节的传输
//        int r1 = is.read();
//        System.out.println(r1);
//        int r2 = is.read();
//        System.out.println(r2);
//        int r3 = is.read();
//        System.out.println(r3);
//        int r4 = is.read();
//        System.out.println(r4);
//        int r5 = is.read();
//        System.out.println(r5); // 最后没有数据后，得到的字节为 -1；



//        // 改造
//        int r;
//        while ((r = is.read()) != -1){
//            System.out.print(r);
//        }
//
//
//        is.close(); // 关闭流，提高系统的性能


        // 一组数据进行传输

        byte[] bytes = new byte[3];
//        int len1 = is.read(bytes);//这个方法的返回值是此次的字节个数
//        System.out.println(len1);
//        System.out.println(Arrays.toString(bytes));
//        int len2 = is.read(bytes);
//        System.out.println(len2);
//        System.out.println(Arrays.toString(bytes));
//        int len3 = is.read(bytes);
//        System.out.println(len3);// 当此轮没有字节要传输时，返回值为-1；
//        System.out.println(Arrays.toString(bytes));


        // 改造
        int len;
        while ((len = is.read(bytes)) != -1){
            String rs = new String(bytes,0,len); // 取多少 倒 多少
            System.out.print(rs);
        }



        is.close();
    }
}
