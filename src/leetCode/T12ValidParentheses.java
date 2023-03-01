package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class T12ValidParentheses {
    public static void main(String[] args) {
        String str = "([]{})";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        char[] chars = s.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (map.containsKey(ch)) {
                stack.push(ch);
            }
            if (stack.size() != 0 && map.containsValue(ch)) {
                if (map.get(stack.peek()).equals(ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (stack.size() == 0 && map.containsValue(ch)) {
                return false;
            }
        }
        return stack.empty();
    }
}
