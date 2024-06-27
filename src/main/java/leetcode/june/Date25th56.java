package leetcode.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Date25th56 {
    public int[][] merge(int[][] intervals) {
        // 原来这个方法是: 把所有能合并的区间合并一下, 然后返回就好了. 不是说所有的都能合并在一起...
        Arrays.sort(intervals, Comparator.comparingInt(o -> ((int[]) o)[0]));

        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (res.isEmpty() || res.get(res.size() - 1)[1] < intervals[i][0]) {
                res.add(intervals[i]);
            } else if (res.get(res.size() - 1)[1] < intervals[i][1]) {
                res.get(res.size() - 1)[1] = intervals[i][1];
            }
        }

        return res.toArray(new int[res.size()][2]);
    }
}
