package leetCode;

import java.util.Scanner;

public class T24LongestWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

    public static String LongestWord(String sen) {
        String[] words = sen.split(" ");
        String maxWord = "";
        for (String word : words) {
            if (word.matches("[a-zA-Z]*")) {
                maxWord = word;
                break;
            }
        }

        for (int i = 1; i < words.length; i++) {
            if (words[i].matches("[a-zA-Z]*") && (words[i].length() > maxWord.length())) {
                maxWord = words[i];
            }
        }
        return maxWord;
    }
}
