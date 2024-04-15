package leetcode.april;

import java.util.ArrayList;
import java.util.List;

public class Date15th225 {
    List<Integer> list;

    public Date15th225() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(0, x);
    }

    public int pop() {
        Integer pop = list.get(0);
        list.remove(0);
        return pop;
    }

    public int top() {
        return list.get(0);
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
