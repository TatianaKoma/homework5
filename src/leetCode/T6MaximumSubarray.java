package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class T6MaximumSubarray {
    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(numbers));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        List<Integer> sums = new ArrayList<>();
        if (nums.length == 1) {
            return nums[0];
        } else {
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                sums.add(sum);
                for (int j = i + 1; j < nums.length; j++) {
                    sum += nums[j];
                    sums.add(sum);
                }
                sum = 0;
            }
        }
//        return sums.stream().mapToInt(Integer::intValue).max().orElseThrow(NoSuchElementException::new);
        return sums.stream().flatMapToInt(IntStream::of).max().orElseThrow(NoSuchElementException::new);
    }

//    public static int maxSubArray(int[] nums) {
//        int maxSum = nums[0];
//        int currSum = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            currSum = Math.max(currSum + nums[i], nums[i]);
//            maxSum = Math.max(maxSum, currSum);
//        }
//        return maxSum;
//    }
}
