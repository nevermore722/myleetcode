package leetcode.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date07th47 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] used = new int[nums.length];
        Arrays.sort(nums);
        backTracking(nums, used);
        return result;
    }

    private void backTracking(int[] nums, int[] used) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == 1) {
                continue;
            }
            if (i > 0 && used[i - 1] == 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            used[i] = 1;
            backTracking(nums, used);
            used[i] = 0;
            list.remove(list.size() - 1);
        }
    }
}
