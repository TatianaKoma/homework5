package courseTasks;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            newList.add(i);
        }
        newList.removeAll(list);
        return newList.get(0);
    }
}
