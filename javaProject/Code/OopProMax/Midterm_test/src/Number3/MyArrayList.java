package Number3;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrayList {
    public static int len;
    Scanner  scanner = new Scanner(System.in);

    public static int[] initArrayList(){
        //模拟泛型，根据提供的type，该集合，只能存相应的元素
        int[] arr = new int[10];
        len = 0;
        return arr;
    }

    public static int[] add(int[] arr,int a){
        while (true) {
            if(len < arr.length){
                //可以添加元素
                arr[len] = a;
                len++;
                break;
            }else {
                //集合容器不足，需要扩容，我规定，每次容量加10
                int[] arr2 = Arrays.copyOf(arr, arr.length + 10);
                System.out.println(Arrays.toString(arr2));
            }
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
