package leetcode.april;

import org.apache.commons.lang3.StringUtils;

import java.util.Stack;

public class Date17th1047 {
    public String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char chr : chars) {
            if (!stack.isEmpty() && stack.peek() == chr) {
                stack.pop();
            } else {
                stack.push(chr);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character chr : stack) {
            result.append(chr);
        }
        return result.toString();
    }
}
