package courseTasks;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(getSum(1,2));
    }
    public static int getSum(int a, int b){
       return Math.addExact(a,b);
    }
}
