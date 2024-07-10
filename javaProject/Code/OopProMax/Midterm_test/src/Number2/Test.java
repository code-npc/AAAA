package Number2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        String[] oneUser = userStrs.split("#");
        System.out.println(Arrays.toString(oneUser));

        for (int i = 0; i < oneUser.length; i++) {
            User user = new User();
            String[] message = oneUser[i].split(":");
//            System.out.println(Arrays.toString(message));
            user.setId(Long.parseLong(message[0]));
            user.setName(message[1]);
            user.setGender(message[2]);
            LocalDate ld = LocalDate.parse(message[3]);
            user.setBirthday(ld);

            users.add(user);
        }

        System.out.println(users);

        //业务二：
        List<String> collectRepeatNames = users.stream().map(s -> s.getName()).collect(Collectors.toList());
        System.out.println(collectRepeatNames);
        List<String> collectNames = users.stream().map(s -> s.getName()).distinct().collect(Collectors.toList());
        Map<String ,Integer> map = new HashMap<>();
        for (int i = 0; i < collectNames.size(); i++) {
            int num = 0;
            for (String s : collectRepeatNames) {
                if (s.equals(collectNames.get(i))){
                    num++;
                }
            }
            map.put(collectNames.get(i),num);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue()+"次");
        }
    }
}
