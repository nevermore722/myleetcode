package leetcode.sep;

import java.util.Stack;

public class Date14th2390 {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder reseult = new StringBuilder();
        for (Character chr : stack) {
            reseult.append(chr);
        }
        return reseult.toString();
    }
}
