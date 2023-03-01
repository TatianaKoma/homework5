package jetBrainsTasks;


public class TaskIgorKononov {
    public static void main(String[] args) throws InterruptedException {
        String phrase = "abbcaaa";
        System.out.println(getCountingPhrase(phrase));
    }

    public static String getCountingPhrase(String phrase) {
        char[] letters = phrase.toCharArray();
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
