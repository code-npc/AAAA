package String;

public class Test1 {
    public static void main(String[] args) {
        //创建一个String对象
        char[] ch= {'坚','持','奋','斗','1','0','天','!',};
        //第一种方法创建，直接在常量池中创建的
        String st1 = "坚持奋斗100天！";
        //第二种方法创建，是在堆中创建的
        String st2 = new String("坚持奋斗99天！");
        //第三中方法创建，同样是在堆中，只是构造函数的方式的不同而已。
        String st3 = new String(ch);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println("----------------------");


        /*
        * 1.获取字符串的长度
        * */
        int res1 = st1.length();
        System.out.println(res1);

        /*
        * 2.获取字符串中某个索引位置下的字符，并返回
        * */
        char res2 = st1.charAt(3);
        System.out.println(res2);

        //遍历字符串中每一个元素
        for (int i = 0; i < st1.length(); i++) {
            System.out.println(st1.charAt(i));
        }

        /*
        * 3.将当前字符串转换成字符数组返回
        * */
        System.out.println("==========");
        char[] res3 = st1.toCharArray();
        for (int i = 0; i < res3.length; i++) {
            System.out.println(res3[i]);
        }
        /*
        * 4.判断当前字符串与另一个字符串的内容是否一样，一样返回true
        * */
        String st4 = "坚持奋斗100天！";
        boolean res4 = st4.equals(st1);
        System.out.println(res4);

        /*
        * 5.判断档期那字符串与另一个字符串的内容是否一样（不区分大小写）
        * */

        String s1 = "53Aj8W";
        String s2 = "53aj8w";
        boolean res5 = s1.equalsIgnoreCase(s2);
        System.out.println(res5);

        /*
        * 6.根据开始和结束索引进行截取，得到新的字符串（索引，包前不包后）
        * */
        String s3 = st1.substring(0,3);
        System.out.println(s3);
        /*
        * 7.从传入的索引处截取，截取到末尾，得到新的字符串并返回
        * */
        String s4 = st1.substring(3);
        System.out.println(s4);
        /*
        * 8.使用新值，将字符串中的旧值替换，得到新的字符串
        * */
        String s5 = st1.replace("100","75");
        System.out.println(s5);

        /*
        * 9.判断字符串中是否包含某个字符串
        * */
        boolean b1 = st1.contains("奋斗");
        System.out.println(b1);

        /*
        * 10.判断字符串是否以某个字符串内容开头，开头返回true
        * */
        boolean b2 = st1.startsWith("坚");
        System.out.println(b2);
        System.out.println(st1.startsWith("坚持d"));
        /*
        * 11.把字符串按照某个字符将内容分隔，并返回字符串数组
        * */
        String arr = "张姐，王杰，路人甲，流氓已，土匪并";
        String[] arr1 = arr.split("，");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }
}
