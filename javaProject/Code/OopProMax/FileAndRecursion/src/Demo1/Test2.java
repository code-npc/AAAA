package Demo1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test2 {
    public static void main(String[] args) {
        //文件的相关操作：
        //file对象的创建
        File f1 = new File("D:\\Edge浏览器下载位置\\安装包\\P1720_3.in");
//        File f2 = new File("D:/Edge浏览器下载位置/安装包/P1720_3.in");
//        System.out.println(f2.length());
        System.out.println(f1.length());
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        File absoluteFile = f1.getAbsoluteFile();
        System.out.println(absoluteFile.equals(f1));

        System.out.println(absoluteFile.length());

        System.out.println(f1.getAbsolutePath());
        System.out.println(absoluteFile.getAbsolutePath());

        File f2 = new File("OopProMax\\FileAndRecursion\\src\\Demo1\\Test2.java");
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getPath());
        System.out.println(f2.getAbsoluteFile().getPath());
        System.out.println("=====================================================");


        File f3 = new File("D:\\Edge浏览器下载位置\\安装包");
        //判断文件的路径是否存在
        System.out.println(f1.exists());
        //判断文件是否是文件
        System.out.println(f1.isFile());
        //判断文件是否是文件夹
        System.out.println(f1.isDirectory());
        System.out.println(f3.isDirectory());
        //获取文件的名称
        System.out.println(f1.getName());
        System.out.println(f3.getName());
//        获取文件的大小
        System.out.println(f1.length());
        System.out.println(f3.length());//文件夹的大小，不包括文件夹里面的内容，只是文件夹本身的大小
        //获取文件的最后修改时间
        System.out.println(f1.lastModified());//返回值是时间毫秒值。
        long l = f1.lastModified();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(l));
        System.out.println(f3.lastModified());
        System.out.println(simpleDateFormat.format(f3.lastModified()));
    }
}
