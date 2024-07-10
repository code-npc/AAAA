package Demo1;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        //文件的批量修改
        File dir = new File("D:\\Edge浏览器下载位置\\aaa");
        File[] files = dir.listFiles();
        for (File f : files) {
            String name = f.getName();
            String s = name.substring(0,name.indexOf("."));
            String l = name.substring(name.indexOf("."),name.length());
            String newname =  (Integer.valueOf(s)+10) +l;
            f.renameTo(new File(f.getParent(),newname));
        }

    }
}
