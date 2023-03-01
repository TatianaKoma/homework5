package exceptions;

public class Example2TryFinally {
    public static void main(String[] args) {

        try {
            String str = "+++";
            int num = Integer.parseInt(str);
            System.out.println("Inside try block");

        } finally {
            System.out.println("finally block executed");
        }
        System.out.println("Outside try-finally clause");
    }
}
