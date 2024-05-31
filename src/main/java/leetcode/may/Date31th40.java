package leetcode.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date31th40 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int[] used = new int[candidates.length];
        backTracking(candidates, target, 0, 0, used);
        return result;
    }

    private void backTracking(int[] candidates, int target, int startIndex, int sum, int[] used) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1] && used[i - 1] == 0) {
                continue;
            }
            list.add(candidates[i]);
            sum += candidates[i];
            used[i] = 1;
            backTracking(candidates, target, i + 1, sum, used);
            used[i] = 0;
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }
}
