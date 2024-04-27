package leetcode.april;

import java.util.*;

public class Date21st347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.merge(num, 1, Integer::sum);
        }
        // 使用小顶堆找第前k个高频元素
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(entry.getValue());
            } else {
                Integer poll = priorityQueue.poll();
                if (poll > entry.getValue()) {
                    priorityQueue.offer(poll);
                } else {
                    priorityQueue.offer(entry.getValue());
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (priorityQueue.contains(entry.getValue())) {
                result.add(entry.getKey());
            }
        }


        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
