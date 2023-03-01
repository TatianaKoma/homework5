package courseTasks;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "tagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        char[]arrs= s.toCharArray();
        char[]arrt = t.toCharArray();
        Arrays.sort(arrs);
        Arrays.sort(arrt);
        return Arrays.equals(arrs, arrt);
    }
}
