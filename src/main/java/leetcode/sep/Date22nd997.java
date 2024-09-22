package leetcode.sep;

import java.util.*;

public class Date22nd997 {
    public int findJudge(int n, int[][] trust) {
        if (n == 1) {
            return 1;
        }
        Map<Integer, Integer> resultMap = new HashMap<>();
        Set<Integer> errorSet = new HashSet<>();
        for (int[] value : trust) {
            errorSet.add(value[0]);
        }
        for (int[] ints : trust) {
            if (resultMap.containsKey(ints[1])) {
                int sum = resultMap.get(ints[1]) + 1;
                if (sum == n - 1 && !errorSet.contains(ints[1])) {
                    return ints[1];
                }
                resultMap.put(ints[1], sum);
            } else {
                if (n == 2 && !errorSet.contains(ints[1])) {
                    return ints[1];
                }
                resultMap.put(ints[1], 1);
            }
        }
        return -1;
    }
}
