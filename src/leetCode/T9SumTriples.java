package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T9SumTriples {
    public static void main(String[] args) {
        int[] numbers = new int[]{-2,0,1,1,2};
        System.out.println(threeSum(numbers));
    }

    public  static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length < 3) return new ArrayList<>(set);
        Arrays.sort(nums);
        for(int i = 0; i <nums.length - 2; i ++) {
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i] , nums[j ++], nums[k --]));
                }
                else if(sum > 0){
                    k --;
                }
                else{
                    j ++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
