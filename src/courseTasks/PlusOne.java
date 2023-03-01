package courseTasks;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 8, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        if (ifAllNumbersAreNine(digits)) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            for (int i = 1; i < newArray.length; i++) {
                newArray[i] = 0;
            }
            return newArray;
        } else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] = digits[i] + 1;
                    break;
                }
            }
        }

        return digits;
//        StringBuilder sb = new StringBuilder();
//        for (int j : digits) {
//            sb.append(j);
//        }
//        int result = Integer.parseInt(sb.toString()) + 1;
//        List<Integer> nums = new ArrayList<>();
//        while (result > 0) {
//            int digit = result % 10;
//            nums.add(digit);
//            result /= 10;
//        }
//        Collections.reverse(nums);
//        return nums.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
    }

    public static boolean ifAllNumbersAreNine(int[] nums) {
        for (int num : nums) {
            if (num != 9) {
                return false;
            }
        }
        return true;
    }
}

