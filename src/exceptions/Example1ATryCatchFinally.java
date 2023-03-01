package exceptions;

public class Example1ATryCatchFinally {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        try {
            String str = "+++";
            int num = Integer.parseInt(str);
            System.out.println("try block fully executed");
            return 1;
        } catch (NumberFormatException ex) {

            System.out.println("catch block executed...");
            return 2;
        } finally {
            System.out.println("finally block executed");
            return 3;
        }
    }
}
