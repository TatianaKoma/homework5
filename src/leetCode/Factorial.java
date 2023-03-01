package leetCode;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(1));
        System.out.println(getFactorialWithRecursion(1));
    }

    public static int getFactorial(int number) {
        int multiply = 1;
        for (int i = number; i > 1; i--) {
            multiply = multiply * i;
        }
        return multiply;
    }

    public static int getFactorialWithRecursion(int number) {
        if (number <= 2) {
            return number;
        }
        return number * getFactorialWithRecursion(number - 1);
    }
}
