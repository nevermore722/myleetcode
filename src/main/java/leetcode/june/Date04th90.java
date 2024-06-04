package leetcode.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date04th90 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int[] used = new int[nums.length];
        backTracking(nums, 0, used);
        return result;
    }

    private void backTracking(int[] nums, int startIndex, int[] used) {
        result.add(new ArrayList<>(list));
        if (startIndex >= nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == 0) {
                continue;
            }
            list.add(nums[i]);
            used[i] = 1;
            backTracking(nums, i + 1, used);
            used[i] = 0;
            list.remove(list.size() - 1);
        }
    }
}
