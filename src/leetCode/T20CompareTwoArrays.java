package leetCode;

import java.util.HashSet;
import java.util.Set;

public class T20CompareTwoArrays {
    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = {'r', 'a', 'p'};
        System.out.println(containsCommonItem(array1,array2));
    }

    public static boolean containsCommonItem(char[] array1, char[] array2) {
        Set<Character> set = new HashSet<>();
        for (char c : array1) {
            set.add(c);
        }
        for (char c : array2) {
            if (set.contains(c)) {
                return true;
            }
        }
        return false;
    }
}
