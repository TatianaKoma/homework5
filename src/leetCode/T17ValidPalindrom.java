package leetCode;

public class T17ValidPalindrom {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String newStr = s.toLowerCase().trim().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(newStr);
        return sb.reverse().toString().equals(newStr);
    }

}
