package leetcode.sep;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Date12th2576 {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int i = 0, n = nums.length;
        for (int j = (n + 1) / 2; j < n; ++j) {
            if (nums[i] * 2 <= nums[j]) {
                ++i;
            }
        }
        return i * 2;
    }
}
