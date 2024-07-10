package IOBuffer;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        //1.掌握流   的高级的释放资源的方法
        //2.学会使用缓冲流，4中
        //3.性能测试

        Copy01();//有缓冲池一个一个字节的复制文件所用时间：0.828s
        Copy02();//有缓冲池一个一个字节数组来复制文件所用时间：0.045s
        Copy03();//无缓冲池一个一个字节的复制文件所用时间：96.355s
        Copy04();//无缓冲池一个一个字节数组的复制文件所用时间：0.146s


        //总结，一个一个字节的复制，有无缓冲池都比较慢，但是带缓冲池的要好很多，缓冲池的默认大小为8kb，可手动指定
    }
    public static void Copy01(){
        long startTime = System.currentTimeMillis();
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Edge浏览器下载位置\\安装包\\鼻炎的原因见解.mp4"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\01.mp4"));
                ) {

            int len;
            while ((len = bis.read())!= -1){
                bos.write(len);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("有缓冲池一个一个字节的复制文件所用时间："+ (endTime-startTime)/1000.0 +"s");

    }

    public static void Copy02(){
        long startTime = System.currentTimeMillis();
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Edge浏览器下载位置\\安装包\\鼻炎的原因见解.mp4"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\02.mp4"));
        ) {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer))!= -1){
                bos.write(buffer,0,len);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("有缓冲池一个一个字节数组来复制文件所用时间："+ (endTime-startTime)/1000.0 +"s");

    }

    public static void Copy03(){
        long startTime = System.currentTimeMillis();
        try(
                InputStream is = new FileInputStream("D:\\Edge浏览器下载位置\\安装包\\鼻炎的原因见解.mp4");
                OutputStream os = new FileOutputStream("D:\\03.mp4");
        ) {

            int len;
            while ((len = is.read())!= -1){
                os.write(len);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("无缓冲池一个一个字节的复制文件所用时间："+ (endTime-startTime)/1000.0 +"s");

    }


    public static void Copy04(){
        long startTime = System.currentTimeMillis();
        try(
                InputStream is = new FileInputStream("D:\\Edge浏览器下载位置\\安装包\\鼻炎的原因见解.mp4");
                OutputStream os = new FileOutputStream("D:\\04.mp4");
        ) {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!= -1){
                os.write(buffer,0,len);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("无缓冲池一个一个字节数组的复制文件所用时间："+ (endTime-startTime)/1000.0 +"s");

    }

}
