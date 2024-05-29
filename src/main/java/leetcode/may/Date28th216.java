package leetcode.may;

import java.util.ArrayList;
import java.util.List;

public class Date28th216 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        recursion(k, n, 1, 0);
        return result;
    }

    private void recursion(int k, int n, int startIndex, int sum) {
        if (list.size() > k || sum + startIndex > n) {
            return;
        }
        for (int i = startIndex; i < 10; i++) {
            sum += i;
            list.add(i);
            if (sum == n && list.size() == k) {
                result.add(new ArrayList<>(list));
            }
            recursion(k, n, i + 1, sum);
            sum -= i;
            list.remove(list.size() - 1);
        }
    }
}
