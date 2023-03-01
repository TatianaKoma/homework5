package leetCode;

import java.util.HashSet;
import java.util.Set;

public class T22ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 7, 2, 3};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        return uniqueNumbers.size() != nums.length;
    }
}
