package courseTasks;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String str = "leelwtcode";
        System.out.println(firstUniqChar(str));
    }


    public static int firstUniqChar(String s) {
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (!isDuplicate(letters, letters[i])) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isDuplicate(char[] letters, char let) {
        Set<Character> uniqLetters = new HashSet<>();
        for (char letter : letters) {
            if (!uniqLetters.add(letter) && letter == let) {
                return true;
            }
        }
        return false;
    }
}
