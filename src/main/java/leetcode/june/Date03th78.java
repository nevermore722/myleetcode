package leetcode.june;

import java.util.ArrayList;
import java.util.List;

public class Date03th78 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums, 0);
        return result;
    }

    private void backTracking(int[] nums, int startIndex) {
        result.add(new ArrayList<>(list));
        if (startIndex >= nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            list.add(nums[i]);
            backTracking(nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
