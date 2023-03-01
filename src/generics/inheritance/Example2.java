package generics.inheritance;

public class Example2 {
    public static void main(String[] args) {
        MySubclass<String, Integer> x = new MySubclass<String, Integer>("Value is: ", 99);
        System.out.print(x.getob());
        System.out.println(x.getob2());
    }
}

class MyClass<T> {
    T ob;

    MyClass(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class MySubclass<T, V> extends MyClass<T> {
    V ob2;

    MySubclass(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getob2() {
        return ob2;
    }
}
