package String;

import java.util.Scanner;

public class StringCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = 3;
        while (time!=0) {
            System.out.println("=====登录界面=====");
            System.out.println("请输入登录名和密码");
            System.out.print("登录名：");
            String userName = scanner.next();

            System.out.print("密码：");
            String password = scanner.next();

            if(isNameCorect(userName) && isPassWordCorect(password)){
                System.out.println("登录成功！欢迎你进入系统！！");
                break;
            }
            time --;
        }
        System.out.println("程序结束！！");
    }

    /*
    * 判断登录名和密码是否正确
    * */
    public static boolean isNameCorect(String name){
        String corectName = "Java";
        if(name.equals(corectName)){
            return true;
        }else {
            System.out.println("用户名不正确！");
            return false;
        }

    }

    public static boolean isPassWordCorect(String passWord){
        String corectPassWord = "123456";
        if (passWord.equals(corectPassWord)){
            return true;
        }else {
            System.out.println("密码有误！");
            return false;
        }

    }

}
