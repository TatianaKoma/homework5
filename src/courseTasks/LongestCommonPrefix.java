package courseTasks;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "floght"};
        String[] strs1 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs1));
    }
//
//    public static String longestCommonPrefix(String[] strs) {
//        String shortest = findShortestString(strs);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0, j = shortest.length() - 1; i < shortest.length(); ) {
//            if (ifEqual(strs, shortest.substring(i, j + 1), i, j + 1)) {
//                String s = shortest.substring(i, j + 1);
//                sb.append(s);
//                break;
//            } else {
//                j--;
//            }
//        }
//        return sb.length() != 0 ? sb.toString() : "";
//    }
//
//    private static String findShortestString(String[] strs) {
//        String shortest = strs[0];
//        for (String str : strs) {
//            if (str.length() < shortest.length()) {
//                shortest = str;
//            }
//        }
//        return shortest;
//    }
//
//    private static boolean ifEqual(String[] strs, String st, int f, int l) {
//        for (String str : strs) {
//            if (!st.substring(f, l).equals(str.substring(f, l))) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}
