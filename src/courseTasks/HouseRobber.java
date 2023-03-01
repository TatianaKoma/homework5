package courseTasks;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 2};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
//        int prevNo = 0;
//        int prevYes = 0;
//        for (int n : num) {
//            int temp = prevNo;
//            prevNo = Math.max(prevNo, prevYes);
//            prevYes = n + temp;
//        }
//        return Math.max(prevNo, prevYes);

        int ifYes = 0;    // max monney can get if rob current house
        int ifNo = 0; // max money can get if not rob current house

        // We go through all the values, we maintain two counts, 1) if we rob this cell, 2) if we didn't rob this cell
        for (int i = 0; i < nums.length; i++) {

            // If we rob current cell, previous cell shouldn't be robbed. So, add the current value to previous one.
            int currYes = ifNo + nums[i];
            // If we don't rob current cell, then the count should be max of the previous cell robbed and not robbed
            int currNo = Math.max(ifNo, ifYes);

            // Update values for the next round
            ifNo = currNo;
            ifYes = currYes;
        }

        return Math.max(ifYes, ifNo);
    }
}
