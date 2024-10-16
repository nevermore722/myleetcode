package leetcode.oct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Date16th3194 {
    public double minimumAverage(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        double result = 50d;
        for (int i = 0; i < length / 2; i++) {
            result = Math.min(result, (nums[i] + nums[length - 1 - i]) / 2.0d);
        }
        return result;
    }
}
