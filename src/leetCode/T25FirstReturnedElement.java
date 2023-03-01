package leetCode;

import java.util.HashSet;
import java.util.Set;

public class T25FirstReturnedElement {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 5, 3, 2, 4};
        System.out.println(getFirstReturnedElement(arr));
    }

    public static int getFirstReturnedElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (!set.contains(j)) {
                set.add(j);
            } else {
                return j;
            }
        }
        return 0;
    }
}
