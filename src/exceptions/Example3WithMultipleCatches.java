package exceptions;

public class Example3WithMultipleCatches {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[8] = 10;
            System.out.println("First print statement in try block");
        } catch (ArithmeticException e) {
            System.out.println("Warning: Some Other exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArithmeticException");
        } catch (Exception e) {
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        }
        System.out.println("Out of try-catch block");
    }
}
