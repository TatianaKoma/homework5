package leetCode;

import java.util.Arrays;

public class T23RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
//        swap(nums);
        rotate(nums, 10);
    }

    //
//    public static void rotate(int[] nums, int k) {
//        if (nums == null || nums.length < 2) {
//            return;
//        }
//        for (int i = 0; i < k % nums.length; i++) {
//            swap(nums);
//        }
//        System.out.println(Arrays.toString(nums));
//    }
//
//    private static void swap(int[] nums) {
//        for (int i = nums.length - 1; i > 0; i--) {
//            int temp = nums[i];
//            nums[i] = nums[i - 1];
//            nums[i - 1] = temp;
//        }
//    }
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, nums.length - k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start, int end) {
        int tmp = 0;
        while (start < end) {
            tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
