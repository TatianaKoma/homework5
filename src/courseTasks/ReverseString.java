package courseTasks;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
    }

    public static void reverseString(char[] s) {
        int n = s.length / 2;
        int j = s.length - 1;
        for (int i = 0; i < n; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
        System.out.println(Arrays.toString(s));
    }
}
