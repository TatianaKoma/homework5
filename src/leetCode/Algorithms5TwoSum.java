package leetCode;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algorithms5TwoSum {
    public static void main(String[] args) {
        int[] array = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(array, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {
//        for (var i = 0; i < nums.length; i++) {
//            for (var j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;


        // if array has already sorted
//        for (int i = 0, j = nums.length - 1; i < j; ) {
//            int sum = nums[i] + nums[j];
//            if (sum == target) {
//                return new int[]{i, j};
//            } else if (sum > target) {
//                j--;
//            } else {
//                i++;
//            }
//        }
//        return null;


//        int[] result = new int[2];
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i])) {
//                result[1] = i;
//                result[0] = map.get(target - nums[i]);
//                return result;
//            }
//            map.put(nums[i], i);
//        }
//        return result;

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
