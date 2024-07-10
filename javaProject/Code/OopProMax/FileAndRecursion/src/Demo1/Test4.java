package Demo1;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //递归删除一个文件夹下的所有文件
        File dir = new File("D:\\Edge浏览器下载位置\\aa");
//        System.out.println(dir.length());//为什么他的长度会是0呢
        deleteAll(dir);
    }

    public static void deleteAll(File dir) {
        if (dir == null || !dir.exists()) {
            //提供的dir不是文件夹，或者路径不存在，或者无权访问
            return;
        }

        if (dir.isFile()) {
            dir.delete();
            return;
        }

        File[] files = dir.listFiles();//这里拿到，文件夹里面的一级文件对象
        if (files == null) {
            //这个文件夹可能是没有权限的
            return;
        }
        //文件夹里面有内容
        for (File file : files) {
            if (file.isFile()) {
                // 文件夹为空或 是普通文件，直接删除
                file.delete();
            } else {//是非空，可访问文件夹，则递归，继续
                deleteAll(file);
            }
        }
        dir.delete();
    }
}
