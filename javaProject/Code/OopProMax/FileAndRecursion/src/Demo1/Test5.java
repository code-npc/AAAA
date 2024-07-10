package Demo1;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        //文件搜索，找到后返回其绝对路径,例如：QQ.exe
        File f1 = new File("D:\\Ssssssoft");
        findPath(f1,"QQ.exe");

    }

    private static void findPath(File f1,String name) {
        if (f1 == null || !f1.exists() || f1.isFile()){
            //代表接受的数据不合理
            return;
        }
        File[] files = f1.listFiles();
        if (files==null){
            return;
        }
        for (File file : files) {
            if (file.getName().equals(name) && file.isFile()){
                System.out.println(file.getAbsolutePath());
            }
            else {
                findPath(file,name);
            }
        }

    }
}
