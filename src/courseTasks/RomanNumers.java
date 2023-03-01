package courseTasks;

import java.util.Map;

public class RomanNumers {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romanToInt(str));
    }

        public static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int len = s.length();
        int result = map.get(s.charAt(len-1));
        for (int i = len-2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
            }
        }
        return result;
    }
}