package Number1;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        /*
            需求:
        * 目前有100名囚犯，每个囚犯的编号是1-200之间的随机数。现在要求依次随机生成100名囚犯的编号
        * （要求这些囚犯的编号是不能重复的），然后让他们依次站成一排。(注：位置是从1开始计数的)，接下
        * 来，国王命令手下先干掉全部奇数位置处的人。剩下的人，又从新按位置1开始，再次干掉全部奇数位
        * 置处的人，依此类推，直到最后剩下一个人为止，剩下的这个人为幸存者。
        * */
        Random r = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            while (true) {
                int te = r.nextInt(200) + 1;
                if (!isRepeat(numbers, te)) {
                    //表示不重复
                    numbers.add(te);
                    break;
                }
            }
        }


        System.out.println(numbers);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2 = numbers;
        System.out.println(numbers2);
        while (numbers2.size() > 1){
            List<Integer> tempList = new ArrayList<>();

            for (int i = 0; i < numbers2.size(); i++) {
                if(i%2==1){
                    tempList.add(numbers2.get(i));
                }
            }
            numbers2 = tempList;//此法妙极了！！
        }
        System.out.println("幸存者编号为："+numbers2.get(0));
        int foo = numbers2.get(0);
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) == foo){
                System.out.println("其位置为："+ (j+1));
                break;
            }
        }
    }



    public static boolean isRepeat(List<Integer> list, int te) {
        for (int i = 0; i < list.size(); i++) {
            if (te == list.get(i)) {
                //重复返回 true
                return true;
            }
        }
        return false;
    }

}
