package courseTasks;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        System.out.println(Arrays.toString(merge(nums1, 0, nums2, 1)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < (m + n); i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
