package leetcode.may;

import java.util.ArrayList;
import java.util.List;

public class Date30th39 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(candidates, target, 0, 0);
        return result;
    }

    private void backTracking(int[] candidates, int target, int startIndex, int sum) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            list.add(candidates[i]);
            sum = sum + candidates[i];
            backTracking(candidates, target, i, sum);
            sum = sum - candidates[i];
            list.remove(list.size() - 1);
        }
    }
}
