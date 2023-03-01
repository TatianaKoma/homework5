package exceptions;

public class Example1TryCatchFinally {
    public static void main(String[] args) {

        try {
            String str = "+++";
            int num = Integer.parseInt(str);
            System.out.println("try block fully executed");

        } catch (NumberFormatException ex) {

            System.out.println("catch block executed...");

        } finally {
            System.out.println("finally block executed");
        }
        System.out.println("Outside try-catch-finally clause");
    }
}
