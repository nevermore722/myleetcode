package leetcode.april;

import java.util.Stack;

public class Date16th20 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> bracketsStack = new Stack<>();
        for (Character chr : chars) {
            if (chr == '(') {
                bracketsStack.add(')');
            } else if (chr == '{') {
                bracketsStack.add('}');
            } else if (chr == '[') {
                bracketsStack.add(']');
            } else if (!bracketsStack.isEmpty() && chr == bracketsStack.pop()) {
                continue;
            } else {
                return false;
            }
        }
        return bracketsStack.isEmpty();
    }
}
