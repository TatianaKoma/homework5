package generics.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 4, 6);
        double sum = sum(integers);
        System.out.println("Sum of integers = " + sum);


        List<Double> doubles = Arrays.asList(3.14, 1.68, 2.94);
        sum = sum(doubles);
        System.out.println("Sum of doubles = " + sum);

        List<Number> numbers1 = Arrays.<Number>asList(2, 4, 6, 3.14, 1.68, 2.94);
        sum = sum(numbers1);
        System.out.println("Sum of numbers = " + sum);
//-----------

//        List<? extends Number> numbers = new ArrayList<Integer>();
//        numbers.add(123);
//        numbers.add(null);
    }

    public static double sum(Collection<? extends Number> numbers) {
        double result = 0.0;

        for (Number num : numbers) result += num.doubleValue();

        return result;
    }
}

