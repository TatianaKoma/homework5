package leetCode;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacciSum(0));
        int[]arr = new int[]{2,65,34,2,1,7,8};
       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int getFibonacciSum(int number) { //O(n)
        if (number < 2) {
            return number;
        }
        int prev = 0;
        int next = 1;
        int sum = 0;
        int i = 1;
        while (i != number) {
            sum = prev + next;
            prev = next;
            next = sum;
            i++;
        }
        return sum;
    }

    public static int getFibonacciSumWithRecursion(int number) { //O(2^n)
        if (number < 2) {
            return number;
        }
        return getFibonacciSumWithRecursion(number - 1) + getFibonacciSumWithRecursion(number - 2);
    }
}
