package Demo3;

import java.util.List;
import java.util.Random;

public class MyThread extends Thread{
    private List<Gift> gifts;
    private int count;
    public MyThread(String name,List<Gift> gifts){
        super(name);
        this.gifts = gifts;
    }

    @Override
    public void run() {
        Random random = new Random();
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (gifts) {
                if (gifts.size() < 10){//不满足条件，停止线程
                    System.out.println(name + "最终发了"+ count+ "件礼物");
                    break;
                }else {
                    int index = random.nextInt(gifts.size());
                    gifts.remove(index);
                    count++;
                }
            }
        }

    }
}
