package courseTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    //    public static List<Character> removeDuplicates(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        List<Integer> list = new ArrayList<>(set);
//        int count = nums.length - set.size();
//        List<Character> listChar = new ArrayList<>();
//        for (Integer integer : list) {
//            listChar.add((char) (integer + '0'));
//        }
//        for (int i = 0; i < count; i++) {
//          listChar.add('_');
//        }
//        return listChar;
//    }
//
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}
