package Bytes;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        // 了解 编码和译码，
        //常见编码方式：ascll码，只有字母，数字，和一些字符，只占用一个字节，
        // GBK ，兼容ascll码，可以表示中文字符，占用2 个字节
        // UTF-8 ，兼容ascll码，和各个国家的字符，其中每种，占用的字节个数各不相同，ascll码占用一个字节，中文字符占用3个字节

        // 编码。getbyte（）
        String a = "ab123";
        String v = "ab我123";
        byte[] gbks = a.getBytes("GBK");
        byte[] re = a.getBytes();
        byte[] bytes = v.getBytes();//
        byte[] bytes1 = v.getBytes("GBK");


        System.out.println(Arrays.toString(bytes1));//7位
        System.out.println(Arrays.toString(bytes));//8位

        System.out.println(Arrays.toString(gbks));//
        System.out.println(Arrays.toString(re)); // 默认用UTF-8的编码方式

        // 译码 。 new String（byte）

        String s = new String(re);
        String s2 = new String(bytes);
        String s1 = new String(bytes1);
        String s11 = new String(bytes1,"GBK");
        System.out.println(s1);//含有乱码 ab？？123
        System.out.println(s11);//指定译码方式后，正常译码
        System.out.println(s2);// 正常译码

        System.out.println(s);


    }
}
