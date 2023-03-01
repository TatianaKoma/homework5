package courseTasks;

public class PowerOfThree {
    public static void main(String[] args) {
//        System.out.println(isPowerOfThree(45));
        System.out.println(log(243));
    }

    //    public static boolean isPowerOfThree(int n) {
//        if (n == 0) {
//            return false;
//        }
//        if (n == 1) {
//            return true;
//        }
//        if (n > 3) {
//            return isPowerOfThree(n / 3);
//        } else {
//            return n % 3 == 0;
//        }
//    }
    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        if (n > 3) {
            return isPowerOfThree(n / 3);
        } else {
            return n % 3 == 0;
        }
    }

    public static boolean log(double n) {
        double result = Math.log10(n) / Math.log10(3);
        return result % 1 == 0;
    }
}
