package courseTasks;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 4};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = 1;
            if (!map.containsKey(num)) {
                map.put(num, count);
            } else {
                count = map.get(num) + 1;
                map.put(num, count);
            }
        }
        int number = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                number = entry.getKey();
            }
        }
        return number;
    }
}
