package generics.inheritance;

public class Example3 {
    public static void main(String args[]) {
        MySubclass3<String> w = new MySubclass3<String>("Hello", 4);
        System.out.print(w.getob() + " ");
        System.out.println(w.getnum());
    }
}

class MyClass3 {
    int num;

    MyClass3(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}

class MySubclass3<T> extends MyClass3 {
    T ob;

    MySubclass3(T o, int i) {
        super(i);
        ob = o;
    }

    T getob() {
        return ob;
    }
}
