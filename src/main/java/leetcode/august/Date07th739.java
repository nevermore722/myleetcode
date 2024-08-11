package leetcode.august;

import java.util.Stack;

public class Date07th739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            if (!stack.isEmpty() && temperatures[i] <= temperatures[stack.peek()]) {
                stack.push(i);
            }
            if (stack.isEmpty()) {
                stack.push(i);
            }
        }
        return result;
    }
}
