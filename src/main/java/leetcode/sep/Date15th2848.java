package leetcode.sep;

import java.util.Arrays;
import java.util.List;

public class Date15th2848 {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] result = new int[101];
        for (List<Integer> integerList : nums) {
            Integer begin = integerList.get(0);
            Integer end = integerList.get(1);
            for (int i = 0; i < result.length; i++) {
                if (i >= begin && i <= end) {
                    result[i] = 1;
                }
            }
        }
        return Arrays.stream(result).sum();
    }
}
