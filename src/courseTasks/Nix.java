package courseTasks;

public class Nix {
        public static void main(String [] args) {
            try {
                badMethod();
                System.out.print("A");
            } catch (Exception ex) {
                System.out.print("B");
            } finally {
                System.out.print("C");
                System.out.println();
            }
            System.out.print("D");
        }

        public static void badMethod() {
            throw new Error();
        }

//        try {
//            int x = 0;
//            int y = 5 / x;
//        } catch (Exception e) {
//            System.out.println("Exception");
//        } catch (ArithmeticException ae) {
//            System.out.println("Arithmetic Exception");
//        }
//        System.out.println("finished");
    }

//    public static void main(String args[]) {
//        int x = 10;
//        int y = new Nix().change(x);
//        System.out.println(x + y);
//    }
//
//    public static int change(int x) {
//        x = 12;
//        return x;
//    }
//}