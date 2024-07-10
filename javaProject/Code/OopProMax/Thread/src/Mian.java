import java.math.BigDecimal;
import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        BigDecimal a1 = new BigDecimal(a);
        BigDecimal b1 = new BigDecimal(b);

        BigDecimal res = a1.multiply(b1);
        System.out.println(res.intValue());
    }
}
