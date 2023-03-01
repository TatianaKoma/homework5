package leetCode;

import java.util.ArrayList;
import java.util.List;

public class T19WordBreak {
    public static void main(String[] args) {
        String str = "applepenapple";
        List<String> wordDict = new ArrayList<>(List.of("apple", "pen"));
        System.out.println(wordBreak(str, wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        char[] chars = s.toCharArray();
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <wordDict.size() ; j++) {
                if(sb.append(s.charAt(i)).toString().equals(wordDict.get(j))){

                }
            }
        }
        return true;
    }
}
