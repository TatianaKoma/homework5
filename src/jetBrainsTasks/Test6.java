package jetBrainsTasks;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 3, 4, 31};
        int[] arr2 = new int[0];
        System.out.println(Arrays.toString(getMergedArray(arr1, arr2)));
        System.out.println(getReversedString("Maman"));
    }

    public static int[] getMergedArray(int[] arr1, int[] arr2) {
        int[] both = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, both, 0, arr1.length);
        System.arraycopy(arr2, 0, both, arr1.length, arr2.length);
        Arrays.sort(both);
        return both;
    }
    public static String getReversedString (String input){
        StringBuilder  sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}

