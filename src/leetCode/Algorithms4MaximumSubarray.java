package leetCode;

public class Algorithms4MaximumSubarray {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
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
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];
        for (int num : nums) {
            curSum = Math.max(curSum + num, num);
            maxSum = Math.max(curSum,maxSum);
        }
        return maxSum;
    }
}
