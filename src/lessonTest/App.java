package lessonTest;

public class App {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Object b1 = new B();

        System.out.println(a.m1());
        System.out.println(a.m2());
        System.out.println(b.m1());
        System.out.println(b.m2());

    }
}

class A {
    public int m1() {
        return 1;
    }

    protected int m2() {
        return 2;
    }
}

class B extends A {
    public int m1() {
        return 10;
    }

    protected int m2() {
        return 20;
    }
}
