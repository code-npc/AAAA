package MapAndStream.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //目标：认识Stream流，学会如何使用Stream流，以及他的常见方法
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,5,5,4,7,8,9,1,5,4,3,4);
        List<Student> students = new ArrayList<>();
        students.add(new Student("李四",12,179.3));
        students.add(new Student("李四",12,179.3));
        students.add(new Student("王五",22,174.2));
        students.add(new Student("王麻子",20,164.2));
        students.add(new Student("王麻子",220,164.2));
        System.out.println(students);
//        System.out.println(list);

//        list.stream().filter(s -> s > 4).forEach(s -> System.out.println(s));
//        list.stream().sorted( (o1,o2) -> o2 - o1).forEach(s-> System.out.println(s));
//        long a = list.stream().count();
//        System.out.println(a);
//        list.stream().limit(5).forEach(s -> System.out.println(s));

//        int a = list.stream().limit(5).min(((o1, o2) -> o1 - o2)).get();
//        System.out.println(a);

//        list.stream().skip(3).forEach(s -> System.out.println(s));
//        list.stream().skip(3).forEach(System.out::println);

//        list.stream().distinct().forEach(System.out::println);

//        Object[] arr = list.stream().filter(s -> s > 3).distinct().toArray();
//        System.out.println(Arrays.toString(arr));

//        List<Integer> list1 = list.stream().filter(s -> s > 3).distinct().toList();
//        Set<Integer> s = list.stream().collect(Collectors.toSet());//收集到set集合中后，自动会把重复的元素去除
//        for (Integer a : s) {
//            System.out.println(a);
//        }

//        list.stream().distinct().forEach(System.out::println);

//        Map<String, Double> collect = students.stream().filter(s -> s.getHeight() > 170)
//                .distinct().collect(Collectors.toMap(s -> s.getName(), s -> s.getHeight()));
//        System.out.println(collect);

        Map<String ,Integer> map = new HashMap<>();
        map.put("李四",12);
        map.put("阿达",22);
        map.put("的方式",62);
        System.out.println(map);
        map.keySet().stream().filter(s -> s.contains("李")).forEach(System.out::println);
        map.values().stream().filter(s -> s > 13).forEach(System.out::println);

        map.entrySet().stream().filter(s-> s.getValue()>21).forEach(s-> System.out.println(s.getKey()+"--->"+s.getValue()));
    }
}
