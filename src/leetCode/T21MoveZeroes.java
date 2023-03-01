package leetCode;

import java.util.Arrays;

public class T21MoveZeroes {
    public static void main(String[] args) {
        int[] num = {0, 1, 0, 3, 12};
        moveZeroes(num);
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j]==0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
