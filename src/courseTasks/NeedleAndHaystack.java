package courseTasks;

public class NeedleAndHaystack {
    public static void main(String[] args) {
        String haystack = "rfrsadrewq";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
