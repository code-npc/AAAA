package Main;



import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] arr = new int[3*n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arr2 = new int[n];
        int a = 3;
        int sum = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(a!=0){
                sum += arr[i];
                a--;
            }else {
                arr2[k] = sum;
                sum = 0;//sum重置
                k++;
                i--;//回退一下，保证不漏数字
                a = 3;//重新下一组成绩
            }
        }
        arr2[arr2.length-1] = sum;

        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (fun1(arr,i*3,j*3)&&fun2(arr2,i,j)){
                    res++;
                }
            }
        }

        System.out.println(res);

        //boolean f1 = fun1(arr,k,t);//判断单科是否满足条件，满足返回true
        //boolean f2 = fun2(arr2,k,t);//判断总分是否满足条件，满足返回true

    }

    //
    private static boolean fun2(int[] arr2,int k,int t) {
        int a = arr2[k] - arr2[t];
        if(Math.abs(a)<=10){
            return true;
        }else {
            return false;
        }
    }

    private static boolean fun1(int[] arr,int k,int t) {
        for (int i = 0; i < 3; i++) {
            if (Math.abs(arr[k+i] - arr[t+i])<=5){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

}
