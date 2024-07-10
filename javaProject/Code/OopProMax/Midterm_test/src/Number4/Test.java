package Number4;

import javax.naming.LinkException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate startTime = LocalDate.parse("2022-02-03");
        LocalDate startTime2 = startTime;//备份一份，后面的操作，导致源信息丢失
        System.out.println(startTime);
        System.out.println("请输入要查询的月份：必须是2022年2月之后的月份");
        String time = scanner.next()+"-01";//不这么写的话，日期格式，解析不成功，用格式化器也不行
        LocalDate inputTime = LocalDate.parse(time);
        LocalDate endTime = inputTime.plusMonths(1).minusDays(1);
        System.out.println(endTime);
        //获取之间的天数
        long days = ChronoUnit.DAYS.between(startTime, endTime);
        System.out.println("之间相差的天数："+days);

        //用来存放在这期间的每一天的日期信息
        List<Day> dayList = new ArrayList<>();
        int n = 1;int m = 1;
        while (!startTime.isAfter(endTime)){
            Day day = new Day();

            day.setDate(startTime);
            if (n == m) {
                day.setFlag(true);//代表休息
                m += 3;
            }else {
                day.setFlag(false);
            }
            dayList.add(day);
            n++;
            LocalDate tempTime = startTime.plusDays(1);
            startTime = tempTime;
        }

        System.out.println("所有日期的详情："+dayList);
        //从中筛选出，所选月份的日子
        List<Day> resultTime = new ArrayList<>();
        for (Day day : dayList) {
            if (!day.getDate().isBefore(inputTime)){
                resultTime.add(day);
            }
        }

        System.out.println("所需月份的所有日期信息："+resultTime);
        //遍历，所需月份，找到满足休息日是周六或周日的
        for (Day day : resultTime) {
            int value = day.getDate().getDayOfWeek().getValue();
            if((value==6|| value== 7) && day.isFlag()){
                System.out.println(day);
            }
        }

    }
}
