package leetcode.april;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Date19th239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Integer> myQueue = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        int maxValue = Arrays.stream(nums).limit(k).max().getAsInt();
        result[0] = maxValue;

        for (int i = 0; i < k; i++) {
            int size = myQueue.size();
            for (int j = 0; j < size; j++) {
                Integer poll = myQueue.poll();
                if (poll >= nums[i]) {
                    myQueue.add(poll);
                }
            }
            myQueue.add(nums[i]);
        }

        for (int i = 1; i <= nums.length - k; i++) {
            if (nums[i - 1] == myQueue.peek()) {
                myQueue.poll();
            }
            if (!myQueue.isEmpty() && myQueue.peek() < nums[i + k - 1]) {
                myQueue.clear();
                myQueue.add(nums[i + k - 1]);
            } else {
                int size = myQueue.size();
                for (int j = 0; j < size; j++) {
                    Integer poll = myQueue.poll();
                    if (poll >= nums[i + k - 1]) {
                        myQueue.add(poll);
                    }
                }
                myQueue.add(nums[i + k - 1]);
            }

            result[i] = myQueue.peek();
        }
        return result;
    }
}
