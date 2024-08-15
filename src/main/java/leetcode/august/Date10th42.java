package leetcode.august;

import java.util.Deque;
import java.util.LinkedList;

public class Date10th42 {
    public int trap(int[] height) {
        Deque<Integer> stack = new LinkedList<>();
        int area = 0;
        for (int i = 0; i < height.length; ++i) {
            while (stack.size() >= 2 && height[i] > height[stack.peekLast()]) {
                int bottom = height[stack.pollLast()];

                int minHight = Math.min(height[i], height[stack.peekLast()]);

                int det = minHight - bottom;

                int len = i - stack.peekLast() - 1;
                area += det * len;
            }
            //更新左柱
            if (!stack.isEmpty() && height[stack.peekLast()] < height[i]) {
                stack.pollLast();
            }

            stack.offer(i);
        }

        return area;
    }
}
