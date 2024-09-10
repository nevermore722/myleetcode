package leetcode.sep;

import java.util.ArrayList;
import java.util.List;

public class Date08th977 {
    public int[] sortedSquares(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums) {
            resultList.add(num * num);
        }
        return resultList.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
