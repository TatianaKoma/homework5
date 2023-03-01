package generics.wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<Number>();
        append(numbers, 5);
        numbers.add(6.789);
        System.out.println(numbers);

// ----------------
        List<Object> objects = new ArrayList<Object>();
        append(objects, 3);
        objects.add("Four");

        System.out.println(objects);
    }

    public static void append (Collection<? super Integer> integers, int n) {
        for (int i = 1; i <= n; i++) {
            integers.add(i);
        }
    }
}
