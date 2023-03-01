package courseTasks;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(30));
    }

    public static int trailingZeroes(int n) {
        int counter = 0;
        long factorial = getFactorial(n);
        while (factorial % 10 == 0) {
            counter++;
            factorial /= 10;
        }
        return counter;
    }

    private static long getFactorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
