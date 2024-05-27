package leetcode.may;

import java.util.ArrayList;
import java.util.List;

public class Date27th77 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        recursion(n, k, 1, list);
        return result;
    }

    private void recursion(int n, int k, int startIndex, List<Integer> list) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        int size = n - (k - list.size()) + 2;
        for (int i = startIndex; i < size; i++) {
            list.add(i);
            recursion(n, k, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
