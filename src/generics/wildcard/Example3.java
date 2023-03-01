package generics.wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
//        List<? super Integer> integers = new ArrayList<Integer>();
//        sum(integers);
    }

    public static double sum(Collection<? extends Number> numbers) {
        double result = 0.0;

        for (Number num : numbers) result += num.doubleValue();

        return result;
    }
}
