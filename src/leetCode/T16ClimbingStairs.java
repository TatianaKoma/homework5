package leetCode;

public class T16ClimbingStairs {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairs(4));

    }

    public static int climbStairs(int n) {
        int answer = 1;
        for(int i = 0, pre = 0; i < n; i++) pre = (answer += pre) - pre;
        return answer;
    }
}
