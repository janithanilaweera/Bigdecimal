import java.math.*;

public class calculator{
	static Double d =0.00083878445;
    public static void main(String[] args) {

        BigDecimal value1 = new BigDecimal("0.00083878445");
        BigDecimal returnValue = calculation(2,value1);
        System.out.println("value is :" + returnValue);
        System.out.println(d * 2);
    }

   public static BigDecimal calculation(int no1, BigDecimal no2){
        BigDecimal value = BigDecimal.valueOf(no1).multiply(no2);
        return value;
    }
}