package courseTasks;

import java.math.BigInteger;

public class FactorialTralingZeroesWithBigNumbers {
    public static void main(String[] args) {
        System.out.println(getFactorial(1));
        System.out.println(trailingZeroes(0));
    }


    public static int trailingZeroes(int n) {
        // solution short and smart:
//        int count = 0;
//        while (n > 0) {
//            n /= 5;
//            count += n;
//        }
//        return count;

        BigInteger factorial = getFactorial(n);
        String text = factorial.toString();
        return text.length() - text.replaceAll("0*$", "").replaceAll("0*.$", ".").length();
    }

    public static BigInteger getFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
