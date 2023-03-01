package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T13SearchInRotatedSortedArray {
    public static void main(String[] args) {
//        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
//        System.out.println(search(nums, 0)); //4
        int[] nums = new int[]{1, 3};
        System.out.println(search(nums, 1));
    }

    public static int search(int[] nums, int target) {
//        List<Integer> newArray = new ArrayList<>();
////            int number = nums[target];
//        int a = Arrays.stream(nums).filter(n -> n == target).findAny().orElse(-1);
//        if (a == -1) {
//            return a;
//        } else {
//            for (int i = target; i < nums.length; i++) {
//                newArray.add(nums[i]);
//            }
//            for (int i = 0; i < target; i++) {
//                newArray.add(nums[i]);
//            }
//
//            return newArray.indexOf(target);
//        }
        if (nums == null || nums.length == 0) return -1;

        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[start]) {
                if (nums[start] <= target && target<= nums[mid])
                    end = mid;
                else
                    start = mid;
            }
            else {
                if (nums[mid] <= target && target <= nums[end])
                    start = mid;
                else
                    end = mid;
            }
        }
        if (nums[start] == target)
            return start;
        else if (nums[end] == target)
            return end;
        else
            return -1;
    }
}
