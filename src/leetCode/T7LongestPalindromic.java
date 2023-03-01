package leetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class T7LongestPalindromic {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        List<String> palindroms = new ArrayList<>();
        if (s.length() == 1) {
            return s;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                sb.append(s.charAt(i));
                palindroms.add(sb.toString());
                for (int j = i + 1; j < s.length(); j++) {
                    sb.append(s.charAt(j));
                    if (isPalindrome(sb.toString())) {
                        palindroms.add(sb.toString());
                    }
                }
                sb.setLength(0);
            }
        }
        return palindroms.stream().max(Comparator.comparing(String::length)).orElse(null);
    }

    //    public static boolean isPalindrome(String str) {
//        StringBuilder rev = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev.append(str.charAt(i));
//        }
//        return str.equals(rev.toString());
//    }
    public static boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder(str);
        return str.equals(rev.reverse().toString());
    }

//    public String longestPalindrome(String s) {
//
//        int startIndex = 0 , maxLength = 0;
//
//        for(int i=0; i<s.length(); i++){
//
//            int oddPositionMax = findLength(s,i,i);
//            int evenPositionMax = findLength(s,i,i+1);
//
//            if(Math.max(oddPositionMax,evenPositionMax) > maxLength )
//            {
//                maxLength = oddPositionMax > evenPositionMax ? oddPositionMax : evenPositionMax;
//                startIndex = oddPositionMax > evenPositionMax ? i- oddPositionMax/2 :  i- evenPositionMax/2 +1;
//            }
//
//        }
//
//        return s.substring(startIndex,startIndex+maxLength);
//    }
//
//    private int findLength(String s,int i,int j){
//        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
//            i--;
//            j++;
//        }
//        return j - i - 1;
//    }
}
