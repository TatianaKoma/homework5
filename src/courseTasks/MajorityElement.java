package courseTasks;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 6, 4, 9};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = 1;
            if (map.containsKey(num)) {
                count = map.get(num) + 1;
            }
            map.put(num, count);
        }
        return map.entrySet().stream()
                .filter(e -> e.getValue() > n)
                .map(Map.Entry::getKey)
                .findFirst().orElseThrow();
    }
}
