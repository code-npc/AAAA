package Main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        // 创建BigDecimal对象
        BigDecimal num1 = new BigDecimal("1");
        BigDecimal num2 = new BigDecimal("3");

        // 未指定精度的除法运算，可能会抛出异常

        BigDecimal result = num1.divide(num2,8,RoundingMode.HALF_UP);
        DecimalFormat de = new DecimalFormat("###.###");
        String a = de.format(result);
        System.out.println("除法结果：" + a);
    }
}
