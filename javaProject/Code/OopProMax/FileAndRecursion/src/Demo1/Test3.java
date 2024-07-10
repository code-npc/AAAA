package Demo1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\Edge浏览器下载位置\\安装包\\P1720_3.out");
//        System.out.println(f1.delete());

        File dir = new File("D:\\Edge浏览器下载位置\\aaa");//这个文件夹是不存在的，调用mkdir方法，可以创建一级文件夹

//        System.out.println(dir.mkdir());

        File dir1 = new File("D:\\Edge浏览器下载位置\\aa\\bb\\cc\\dd\\ee\\ff");//这个文件夹是不存在的，调用mkdirs方法，可以创建多级文件夹
//        System.out.println(dir1.mkdirs());

        File file1 = new File("D:\\Edge浏览器下载位置\\安装包\\1.txt");
//        System.out.println(file1.createNewFile());

//        遍历文件夹，返回文件名的字符串
        File dirs = new File("D:\\Edge浏览器下载位置\\安装包");
        String[] list = dirs.list();
        System.out.println(Arrays.toString(list));

        //遍历文件夹，返回文件数组File[]
        File[] files = dirs.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        File file12 = new File("D:\\Edge浏览器下载位置\\aaa");
        File file11 = new File("D:\\Edge浏览器下载位置\\aa");
        File file = new File("D:\\AAAAAAAA\\javaProject\\Code\\OopProMax\\FileAndRecursion\\src\\Demo1\\Test2.java");
        System.out.println(file.list());//文件，返回null
        System.out.println(file.listFiles());//文件，返会null
        System.out.println(Arrays.toString(file12.list()));//空的文件夹，返回长度为0的数组
        File[] files1 = file12.listFiles();
        System.out.println(Arrays.toString(files1));//返会空的数组


        File file2 = new File("D:\\AAAAAAAA\\javaProject\\Code\\OopProMax\\FileAndRecursion\\src\\Demo");//不存在的一个文件
        System.out.println(file2);
    }
}
