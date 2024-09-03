package leetcode.sep;

public class Date03th2708 {
    public long maxStrength(int[] nums) {
        long max = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            long tmpMax = Math.max(Math.max(nums[i], max), Math.max(nums[i] * max, nums[i] * min));
            long tmpMin = Math.min(Math.min(nums[i], min), Math.min(nums[i] * max, nums[i] * min));
            max = tmpMax;
            min = tmpMin;
        }
        return max;
    }
}
