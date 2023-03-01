package lessonTest;

import java.util.ArrayList;
import java.util.List;


public class Demo {
    public static void main(String[] args) {
        char[] chars1 = new char[]{'a', 'b', 'c'};
        char[] chars2 = new char[]{'x', 'y', 'a'};
        System.out.println(isInCommon(chars1, chars2));
    }

    public static boolean isInCommon(char[] chars1, char[] chars2) {
        List<Character> list = new ArrayList<>();
        for (char c : chars1) {
            list.add(c);
        }
        for (char c : chars2) {
            if (list.contains(c)) {

                return true;
            }
        }
        return false;
    }
}
