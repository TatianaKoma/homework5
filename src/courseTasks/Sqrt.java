package courseTasks;

public class Sqrt {
    public static void main(String[] args) {
        int number = 0;
        System.out.println(mySqrt(number));

    }

    public static int mySqrt(int x) {
//        for (int i = 0; i <= number; i++) {
//            if (i * i == number) {
//                return i;
//            } else if (i * i > number) {
//                return i - 1;
//            }
//        }
//        return 0;
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        double t;
        double sqrtroot = x / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (x / t)) / 2;
        }
        while ((t - sqrtroot) != 0);
        return (int) sqrtroot;
    }
}
