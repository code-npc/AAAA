package com.lc;

public class Test7 {
    public static void main(String[] args) {
        fun(101,200);
    }

    public static void fun(int a,int b){
        //判断a~b之间的素数个数，并将其依次打印出来。

        //信号位思想：假设当前数是素数，如果里面发现不是素数，就将信号位修改，如果从没有过，就是素数。
        int sum = 0;
        for (int i = a; i <= b; i++){
            for (int j = 2; j < i/2; j++) {
                if(i%j==0){
                    break;
                }
                if(j == i/2-1){ ///这里可以设置一个标记位，就不用这么麻烦。
                    sum++;
                    System.out.print(i+" ");
                }
            }

        }
        System.out.println(a+"到"+b+"之间的素数共有："+sum+"个。");
    }

}
