package courseTasks;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 2;

        System.out.println(isNumberHappy(num));
    }

    public static boolean isNumberHappy(int n) {
//        do {
//            num = devideByDigits(num);
//        } while (num * num >= 10);
//
//        return num == 1;
        int s = n,f = n; // slow , fast

        do{
            s = compute(s); // slow computes only once
            f = compute(compute(f)); // fast computes 2 times

            if(s == 1)return true; // if we found 1 then happy indeed !!!
        }while(s != f); // else at some point they will meet in the cycle

        return false; // it's a cycle , not happy at all !!!

    }

    private static int compute(int num) {
        int sum = 0;
        while (num > 0) {
            int digits = num % 10;
            sum += digits * digits;
            num = num / 10;
        }
        return sum;
    }
}
