package courseTasks;

public class TestNix {
//    public static void main(String[] args) {
//        try {
//            return;
//        } finally {
//            System.out.println( "Finally" );
//        }
//    }


//        try {
//            x.doStuff(); }
//        int y = 50;
//    } catch(FooException fe) {
//    }


//        public static void main(String [] args) {
//            try {
//                badMethod();
//                System.out.print("A");
//            } catch (Exception ex) {
//                System.out.print("B");
//            } finally {
//                System.out.print("C");
//            }
//            System.out.print("D");
//        }

//        public static void badMethod() {
//            throw new Error();
//        }


    //        try {
//            int x = 0;
//            int y = 5 / x;
//        } catch (Exception e) {
//            System.out.println("Exception");
//        } catch (ArithmeticException ae) {
//            System.out.println("Arithmetic Exception");
//        }
//        System.out.println("finished");
//    }


    public static void main(String[] args) {
        Person p1 = new Person("John", 22);
        TestNix te = new TestNix();
        Person p2 = te.change(p1);
        System.out.println(p1.pid + " " + p2.name + " " + p2.age);
        System.out.println(p2.pid + " " + p1.name + " " + p1.age);

        
    }

    Person change(Object o) {
        Person p2 = (Person) o;
        p2.age = 25;
        return p2;
    }

    static class Person {
        Person(String s, int i) {
            ++pid;
            name = s;
            age = i;
        }

        static int pid;
        int age;
        String name;
    }
//static int x = 10;
//    public static void main(String[] args) {
//        for(int x = 5; x < 5; x++) {
//        }
//        System.out.print(x);
//    }

//public static void main(String[] args) {
//    int i = 10;
//    int n = ++i % 5;
//    System.out.println(i + " " + n);

//    int i = 10;
//    int n = i++ % 5;
//    System.out.println(i + " " + n);

//    int a[] = {1, 2, 3, 4};
//    System.out.println(a instanceof Object);

//    boolean a = true;
//    boolean b = false;
//    boolean c = false;
//    boolean r1 = a || b && c;
//    boolean r2 = b || c && a || c;
//    System.out.println(r1);
//    System.out.println(r2);
//}
//public static void main(String args[]) {
//    int x =10;
//    int y = new TestNix().change(x);
//    System.out.println(x + y);
//}
//    int change(int x) {
//        x = 12;
//        return x;

//    int a[][] = new int[3][];
//             a[1] = new int[] {1, 2, 3};
//            a[2] = new int[] {4, 5};
//            System.out.print(a[1][1]);

//    boolean a = false;
//    boolean b = true;
//    boolean c = false;
//    boolean r1 = a || b && c;
//    boolean r2 = b || c && a || c;
//    System.out.println(r1);
//    System.out.println(r2);

//    int a = 10;
//    public static void main(String[] args) {
//        new TestNix().print();
//    }
//    public static void print() {
//        int a = 8;
//        System.out.println(a);
//    }

}