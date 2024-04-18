package leetcode.april;

import java.util.Stack;

public class Date18th150 {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                String pop1 = stack.pop();
                String pop2 = stack.pop();
                stack.push(String.valueOf(Integer.parseInt(pop2) + Integer.parseInt(pop1)));
            } else if (token.equals("-")) {
                String pop1 = stack.pop();
                String pop2 = stack.pop();
                stack.push(String.valueOf(Integer.parseInt(pop2) - Integer.parseInt(pop1)));
            } else if (token.equals("*")) {
                String pop1 = stack.pop();
                String pop2 = stack.pop();
                stack.push(String.valueOf(Integer.parseInt(pop2) * Integer.parseInt(pop1)));
            } else if (token.equals("/")) {
                String pop1 = stack.pop();
                String pop2 = stack.pop();
                stack.push(String.valueOf(Integer.parseInt(pop2) / Integer.parseInt(pop1)));
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
