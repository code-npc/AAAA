package DouDiZhu;


import com.lc.interfaceDemo.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    private List<Card> cardList = new ArrayList<>();

    //需求：在房间创建时，就生成一幅扑克牌
    public Room(){

        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2","🃏","🤡"};
        String[] colors = {"♠","♥","♦","♣",};
        int size = 0;
        for (int i = 0; i < numbers.length-2; i++) {
            size++;
            for (String color : colors) {
                Card card = new Card();
                card.setNumber(numbers[i]);
                card.setColor(color);
                card.setSize(size);
                cardList.add(card);
            }
        }
        //添加大小王
        cardList.add(new Card(numbers[13],"",100));//大王
        cardList.add(new Card(numbers[14],"",99));//小王

        //展示一下
        System.out.println("初始牌组："+cardList);

        start(cardList);
    }




    //开始游戏
    private void start(List<Card> cardList) {
        //洗牌
        Collections.shuffle(cardList);
        System.out.println("洗牌后的牌组："+cardList);

        //发牌。。
        List<Card> ZhangSan = new ArrayList<>();
        List<Card> LiSi = new ArrayList<>();
        List<Card> WangWu = new ArrayList<>();

        for (int i = 0; i < cardList.size()-3; i++) {
            if (i%3==0){
                ZhangSan.add(cardList.get(i));
            }else if (i%3==1){
                LiSi.add(cardList.get(i));
            }else {
                WangWu.add(cardList.get(i));
            }
        }
        //展示底牌
        List<Card> dipais = cardList.subList(50, 53);
        System.out.println(dipais);


        sortCards(ZhangSan);
        sortCards(LiSi);
        sortCards(WangWu);
        //展示每位玩家的牌

        System.out.println("张三："+ZhangSan);
        System.out.println("李四："+LiSi);
        System.out.println("王五："+WangWu);


        //选择地主后；
        WangWu.addAll(dipais);
        sortCards(WangWu);
        System.out.println("王五（地主）："+WangWu);
    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSize() - o2.getSize();
            }
        });
    }


}
