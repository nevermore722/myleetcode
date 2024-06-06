package leetcode.june;

import java.util.ArrayList;
import java.util.List;

public class Date05th491 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backTracking(nums, 0);
        return result;
    }

    private void backTracking(int[] nums, int startIndex) {
        if (list.size() >= 2) {
            result.add(new ArrayList<>(list));
        }
        if (startIndex >= nums.length) {
            return;
        }
        int[] used = new int[201];
        for (int i = startIndex; i < nums.length; i++) {
            if (!list.isEmpty() && nums[i] < list.get(list.size() - 1) || (used[nums[i] + 100] == 1)) {
                continue;
            }
            list.add(nums[i]);
            used[nums[i] + 100] = 1;
            backTracking(nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
