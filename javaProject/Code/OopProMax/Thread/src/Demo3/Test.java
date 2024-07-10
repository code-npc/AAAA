package Demo3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Gift> gifts = new ArrayList<>();//礼物集合，用于存放100件礼物
        for (int i = 0; i < 100; i++) {
            Gift gift = new Gift("礼物"+i);
            gifts.add(gift);
        }

        new MyThread("小红", gifts).start();
        new MyThread("小明", gifts).start();

    }
}
