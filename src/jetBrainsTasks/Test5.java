package jetBrainsTasks;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 2);
        numbers.put(2, 3);
        numbers.put(3, 4);
        System.out.println(getSum(numbers));
        var sum = numbers.keySet().stream().reduce(Integer::sum);
        int i = numbers.entrySet().stream().mapToInt(e -> e.getKey() + e.getValue()).sum();

//        int i = numbers.entrySet().stream().mapToInt(e -> e.getKey() + e.getValue()).sum();
        System.out.println(i);
        System.out.println(sum);
    }

    public static int getSum(Map<Integer, Integer> numbers) {
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            sum += entry.getKey() + entry.getValue();
        }
        return sum;
    }
}
