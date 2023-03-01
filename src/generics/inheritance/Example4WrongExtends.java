package generics.inheritance;

public class Example4WrongExtends {

    //wrong
//    class MyClass<T extends Number> {
//        T num;
//
//        MyClass(T i) {
//            num = i;
//        }
//
//        T getNum() {
//            return num;
//        }
//    }
//
//    class MySubclass<T> extends MyClass<T> {
//        MySubclass(T i) {
//            super(i);
//        }
//    }


    //correct
    class MyClass4<T extends Number> {
        T num;

        MyClass4(T i) {
            num = i;
        }

        T getNum() {
            return num;
        }
    }

    class MySubclass4<T extends Number> extends MyClass4<T> {
        MySubclass4(T i) {
            super(i);
        }
    }

    //correct
    class MyClass5<T extends Number> {
        T num;

        MyClass5(T i) {
            num = i;
        }

        T getNum() {
            return num;
        }
    }

    class MySubclass5<T extends Integer> extends MyClass5<T> {
        MySubclass5(T i) {
            super(i);
        }
    }
}
