package jetBrainsTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        String word = "Madam";
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse());
        String sentence = "I'm learning Java.";
        char[] arr = sentence.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);

        }
        System.out.println();
        int a = 5;
        int b = 8;
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println(b);

        String str = "wolf, fox, mouse, fox, wolf";

        Map<String, Integer> words = new HashMap<>();
        String[] splitArr = str.split(", ");
        System.out.println(Arrays.toString(splitArr));

        for (String s : splitArr) {
            if (words.containsKey(s)) {
                int count = words.get(s);
                words.put(s, count + 1);
            } else {
                words.put(s, 1);
            }
        }
        System.out.println(words);
    }
}
