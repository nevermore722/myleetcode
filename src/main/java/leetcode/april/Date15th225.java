package leetcode.april;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Date15th225 {
    Queue<Integer> queue;

    public Date15th225() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int size = queue.size();
        if (size == 0) {
            return 0;
        }
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.poll());
        }
        return queue.poll();
    }

    public int top() {
        int size = queue.size();
        if (size == 0) {
            return 0;
        }
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.poll());
        }
        Integer poll = queue.poll();
        queue.add(poll);
        return poll;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
