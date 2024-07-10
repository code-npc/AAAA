package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("路人甲");
        list.add("账号三");
        list.add("JAVA");
        System.out.println(list);

        /**
         * 2.在此集合中的指定位置插入指定的元素
         * */
        list.add(1,"炮兵乙");
        System.out.println(list);

        /*
        * 3. 返回指定索引处的元素
        * */

        System.out.println(list.get(1));

        /*
        * 4.返回集合中元素的个数
        * */
        int len = list.size();
        System.out.println(len);

        /*
        * 5.删除指定索引处的元素，并返回被删的元素（按索引删除）
        * */
        System.out.println(list.remove(1));
        System.out.println(list);

        /*
        * 6.删除指定的元素，返回删除是否成成(按值删除)
        * */
        System.out.println(list.remove("JAVA"));
        System.out.println(list);

        /*
        * 7.修稿指定索引处的元素，返回被修改的元素
        * */
        System.out.println(list.set(1, "章盖好"));
        System.out.println(list);
    }
}
