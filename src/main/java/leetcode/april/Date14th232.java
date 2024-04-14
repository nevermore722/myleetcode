package leetcode.april;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Date14th232 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Date14th232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (!stack2.empty()) {
            return stack2.pop();
        } else {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    public int peek() {
        int pop = this.pop();
        stack2.push(pop);
        return pop;
    }

    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}
