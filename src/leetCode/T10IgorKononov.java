package leetCode;

public class T10IgorKononov {
    public static void main(String[] args) throws InterruptedException {
        String word = "aabbcb";
        System.out.println(countLetters(word));
    }

    public static String countLetters(String word) {
        char[] letters = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < letters.length; i++) {
            if (letters[i - 1] == letters[i] && (i < letters.length - 1)) {
                count++;
            } else if (letters[i - 1] == letters[i] && (i == letters.length - 1)) {
                count++;
                sb.append(letters[i]).append(count);
            } else if (letters[i - 1] != letters[i] && (i == letters.length - 1)) {
                sb.append(letters[i - 1]).append(count);
                count = 1;
                sb.append(letters[i]).append(count);
            } else {
                sb.append(letters[i - 1]).append(count);
                count = 1;
            }
        }

        return sb.toString();
    }
}
