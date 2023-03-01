package leetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class T4LongestSubstring {
    public static void main(String[] args) {
        String s = "pwweqkw";
        System.out.println(lengthOfLongestSubstring(s));
    }

//    public static int lengthOfLongestSubstring(String s) {
//        StringBuilder sb = new StringBuilder();
//        if (s.length() == 0) {
//            return 0;
//        } else if (s.length() == 1) {
//            return 1;
//        } else {
//            sb.append(s.charAt(0));
//            List<Integer> lengthes = new ArrayList<>();
//            for (int i = 0; i < s.length() - 1; i++) {
//                for (int j = i + 1; j < s.length(); j++) {
//                    if (sb.indexOf(String.valueOf(s.charAt(j))) == -1) {
//                        sb.append(s.charAt(j));
//                    } else {
//                        lengthes.add(sb.length());
//                        sb.setLength(0);
//                        sb.append(s.charAt(i + 1));
//                        break;
//                    }
//                }
//            }
//            lengthes.add(sb.length());
//            lengthes.sort(Collections.reverseOrder());
//            return lengthes.get(0);
//        }
//    }

    public static int lengthOfLongestSubstring(String s) {
        int lengthOfSubstring;
        if (s.length() == 0) {
            lengthOfSubstring = 0;
        } else if (s.length() == 1) {
            lengthOfSubstring = 1;
        } else {
            lengthOfSubstring = checkLengthOfSubstrings(s);
        }
        return lengthOfSubstring;
    }

    private static int checkLengthOfSubstrings(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        List<Integer> lengthes = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (sb.indexOf(String.valueOf(s.charAt(j))) == -1) {
                    sb.append(s.charAt(j));
                } else {
                    lengthes.add(sb.length());
                    sb.setLength(0);
                    sb.append(s.charAt(i + 1));
                    break;
                }
            }
        }
        lengthes.add(sb.length());
        return lengthes.stream().max(Comparator.naturalOrder()).orElseThrow(NoSuchElementException::new);
    }
}
