package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特技枸杞");
        list.add("枸杞子");

/*        int a = list.size();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).contains("枸杞")){
                    list.remove(j);
                }
            }
        }
        System.out.println(list);*/

//        方式1：每删除一个，索引下标就减一
        /*for (int i = 0; i < list.size(); i++) {
                if(list.get(i).contains("枸杞")){
                    list.remove(i);
                    i--;
            }
        }
        System.out.println(list);*/
//          方式2：倒着遍历集合，并删除相对应元素
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("枸杞")) {
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
