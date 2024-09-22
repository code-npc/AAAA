package com.lc.mybatisquickstart;

import com.lc.mybatisquickstart.Mapper.UserMapper;
import com.lc.mybatisquickstart.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

@SpringBootTest
class MybatisQuickstartApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testmybatis() {
        List<User> list = userMapper.list();
        list.stream().forEach(s ->{
            System.out.println(s);
        });
    }


   /* public int fun(String[] operations){
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("C")){
                s.pop();
            }else if (operations[i].equals("D")){
                s.push(s.lastElement()*2);
            }else if (operations[i].equals("+")){
                s.push(s.lastElement()+s.get(s.size()-2));
            }else {
                s.push(Integer.valueOf(operations[i]));
            }
        }
        int sum = 0;
        for (int i = 0; i < s.size(); i++) {
            sum += s.get(i);
        }
        return sum;
    }*/

    /*public String longestCommonPrefix(String[] strs) {
        if (strs[0].equals("") ){
            return "";
        }
        if (strs.length == 1){
            return strs[0];
        }
        String res = "";


        int min = 201;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length() < min){
                min = strs[i].length();
            }
        }


        for (int i = 0; i < min; i++) {
            boolean flag = false;

            String tem = String.valueOf(strs[0].charAt(i));
            int a = 0;
            for (int i1 = 1; i1 < strs.length; i1++) {
                if (String.valueOf(strs[i1].charAt(i)).equals(tem)){
                   a++;
                }else {
                    flag = true;
                    break;
                }
                if (a == strs.length - 1){
                    res += String.valueOf(strs[i1].charAt(i));
                }
            }
            if (flag){
                break;
            }
        }
        
        return res;
    }*/

   /* public ArrayList<Integer> fun(int[][] arr, int target){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int a = arr[i][0];
            BigDecimal bd1 = new BigDecimal(a);
            int b = arr[i][1];
            BigDecimal bd2 = new BigDecimal(b);
            int c = arr[i][2];
            BigDecimal bd3 = new BigDecimal(c);
            int m = arr[i][3];
            BigDecimal bd4 = new BigDecimal(m);
            BigDecimal bd5 = new BigDecimal(10);
            BigDecimal bd6 = new BigDecimal(target);
//            int tem = (int) (Math.pow((Math.pow(a,b) % 10),c) % m);
            BigDecimal[] bigDecimals = bd1.pow(b).divideAndRemainder(bd5);
            BigDecimal[] bigDecimals1 = bigDecimals[1].pow(c).divideAndRemainder(bd4);
//            System.out.println("当前下标："+i +" "+"a:"+ a+" " + "b:"+ b+" "+ "c:"+ c+" "+ "m:"+ m+" "+ "target:"+ target+" "+ "tem:"+ tem);
            if (bigDecimals1[1].compareTo(bd6) == 0){
                list.add(i);
            }
        }

        return list;
    }*/
  /* public  void sort(int[] a) {
       if (a.length > 0) {
           sort(a, 0, a.length - 1);
       }

   }

    public void sort(int[] a, int low, int height) {
        int i = low;
        int j = height;
        if (i > j) {//放在k之前，防止下标越界
            return;
        }
        int k = a[i];

        while (i < j) {
            while (i < j && a[j] > k) { //找出小的数
                j--;
            }
            while (i < j && a[i] <= k) { //找出大的数
                i++;
            }
            if (i < j) {//交换
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }

        }
        //交换K
        k = a[i];
        a[i] = a[low];
        a[low] = k;

        //对左边进行排序,递归算法
        sort(a, low, i - 1);
        //对右边进行排序
        sort(a, i + 1, height);
    }


    public int minRectanglesToCoverPoints(int[][] points, int w) {
        int res = 0;
        int[] arr = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            int point = points[i][0];
            arr[i] = point;
        }
        System.out.println(Arrays.toString(arr));

        //选择插入排序arr
        *//*for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tem = arr[min];
                arr[min] = arr[i];
                arr[i] = tem;
            }
        }*//*
        sort(arr);


        System.out.println(Arrays.toString(arr));

        if (w == 0) {
            return arr.length;
        }


        for (int i = 0; i < arr.length; ) {
            int a = arr[i];
            while (true){
//                if (arr[i] < a+w){
//                    i++;
//                }
                if (arr[i] <= a+w){
                    if (i==arr.length-1){
                        i= i+1;
                        res++;
                        break;
                    }
                    i++;

                }else {
//                    i = i+1;

                    res++;
                    break;
                }

            }
        }

        return res;
    }*/





    public  void sort(int[] a) {
        if (a.length > 0) {
            sort(a, 0, a.length - 1);
        }

    }

    public void sort(int[] a, int low, int height) {
        int i = low;
        int j = height;
        if (i > j) {//放在k之前，防止下标越界
            return;
        }
        int k = a[i];

        while (i < j) {
            while (i < j && a[j] > k) { //找出小的数
                j--;
            }
            while (i < j && a[i] <= k) { //找出大的数
                i++;
            }
            if (i < j) {//交换
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }

        }
        //交换K
        k = a[i];
        a[i] = a[low];
        a[low] = k;

        //对左边进行排序,递归算法
        sort(a, low, i - 1);
        //对右边进行排序
        sort(a, i + 1, height);
    }
    public int maxmiumScore(int[] cards, int cnt) {

        sort(cards);
        System.out.println(Arrays.toString(cards));;
        int sum = 0;
        int tem = 0;
        for(int j = cards.length-cnt; j < cards.length; j++){//用来累加sum
            sum+=cards[j];
            tem = sum;
        }
        for(int k = cnt; k > 0; k--){//保证有cnt 次的交换位置

            if (sum%2 == 0){
                return sum;
            }else {
                for(int i = cards.length-cnt-1; i >= 0; i--){
                    sum = sum + cards[i] - cards[cards.length-k];
                    if(sum%2 == 0){
                        return sum;
                    }else{
                        sum = tem;
                    }
                }
            }
        }
        return 0;
    }

    @Test
    public void tem(){
        int[] cards = {9,5,9,1,6,10,3,4,5,1};
        int cnt = 2;
        System.out.println(maxmiumScore(cards,cnt));
    }

}
