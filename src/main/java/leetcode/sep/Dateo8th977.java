package leetcode.sep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Dateo8th977 {
    public int[] sortedSquares(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums) {
            resultList.add(num * num);
        }
        return resultList.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
