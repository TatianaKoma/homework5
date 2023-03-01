package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class T18LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        List<Integer> array = Arrays.stream(nums)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
        int consecutives = 1;
        List<Integer> listOfConsecutives = new ArrayList<>();
        for (int i = 0; i < array.size()- 1; i++) {
            if ((array.get(i+1)- array.get(i)) == 1) {
                consecutives++;
            } else {
                listOfConsecutives.add(consecutives);
                consecutives = 1;
            }
            listOfConsecutives.add(consecutives);
        }
        return listOfConsecutives.stream()
                .max(Comparator.naturalOrder())

                .orElse(1);
    }
}
