package courseTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray3(nums));
    }

    public static int maxSubArray(int[] nums) {
        List<Integer> resultSums = new ArrayList<>();
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            int maxSum = nums[i];
            resultSums.add(maxSum);
            for (int j = i + 1; j < nums.length; j++) {
                int sum = maxSum + nums[j];
                if (sum > maxSum) {
                    resultSums.add(sum);
                }
                maxSum = sum;
            }
        }
        return Collections.max(resultSums);
    }

    public static int maxSubArray2(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static int maxSubArray3(int[] nums) {
        int sum = nums[0], max = nums[0];
        for (var i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
