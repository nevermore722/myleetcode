package leetcode.sep;

import java.util.Stack;

public class Date05th3174 {
    public String clearDigits(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(charArray[i]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character character : stack) {
            result.append(character);
        }
        return result.toString();
    }
}
