package courseTasks;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;           //counting number of zeroes all together to swap al at once
            } else if (count > 0) {
                int temp = nums[i];   //swapping till count becomes 0
                nums[i] = 0;
                nums[i - count] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
