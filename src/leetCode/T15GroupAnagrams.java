package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class T15GroupAnagrams {
    public static void main(String[] args) {
        String[] words = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        List<List<String>> allAnagrams = new LinkedList<>();
        var list = Arrays.stream(words)
                .map(s -> {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            return new String(c);
        }).collect(Collectors.toList());

        if (words.length == 1) {
            allAnagrams.add(List.of(words[0]));
        }
        for (int i = 0; i < words.length; i++) {
            Set<String> oneAnagram = new HashSet<>();
            if (!checkIfWordContains(words[i], allAnagrams)) {
                oneAnagram.add(words[i]);
                for (int j = i + 1; j < words.length; j++) {
                    if (list.get(i).equals(list.get(j))) {
                        oneAnagram.add(words[j]);
                    }
                }
                allAnagrams.add(new ArrayList<>(oneAnagram));
            }
        }
        return allAnagrams;
    }

    public static boolean checkIfWordContains(String word, List<List<String>> allAnagrams) {
        List<String> allWords = allAnagrams.stream().flatMap(List::stream).collect(Collectors.toList());
        for (String allWord : allWords) {
            if (allWord.equals(word)) {
                return true;
            }
        }
        return false;
    }

//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> allComb = new ArrayList<>();
//        if (strs == null || strs.length == 0) {
//            return allComb;
//        }
//        HashMap<String, List<String>> map = new HashMap<>();
//
//        for (String s : strs) {
//            char[] charArr = s.toCharArray();
//            Arrays.sort(charArr);
//            String curr = new String(charArr);
//            if (!map.containsKey(curr)) {
//                map.put(curr, new ArrayList<String>());
//            }
//            map.get(curr).add(s);
//        }
//
//        for (String s : map.keySet()) {
//            allComb.add(map.get(s));
//        }
//        return allComb;
//    }

}
