package Demo1;
public class Test1 {
    static int resNum = 0;//表示最后喝了多少平
    static int totalNum1 = 0;//表示还剩的空瓶个数
    static int totalNum2 = 0;//表示还剩的瓶盖个数

    public static void main(String[] args) {

        //啤酒2元一瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，问：10元可以喝多少瓶？
        int x = 10;
        fun(x);

    }

    private static void fun(int x) {
        int num1 = x/2;//代表此次喝了多少瓶
        int money3 = x%2;//代表此次兑换后还剩的钱
        resNum += num1;
        int money1 = ((num1+totalNum2)/4)*2;//代表此次盖子可以换的钱
        int money2 = ((num1+totalNum1)/2)*2;//代表此次瓶子可以换的钱
        totalNum2 = (num1+totalNum2)%4;//代表此次兑换后还剩的瓶盖个数
        totalNum1 = (num1+totalNum1)%2;//代表此次兑换后还剩的空瓶个数
        int totalMoney = money1+money2+money3;
        if(totalMoney<=1){
            System.out.println("最后喝了多少瓶："+resNum);
            System.out.println("最后还剩多少空瓶："+totalNum1);
            System.out.println("最后还剩多少瓶盖："+totalNum2);
        }else {
            fun(totalMoney);
        }
    }


}
