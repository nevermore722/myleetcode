package leetcode.april;

import java.util.HashMap;
import java.util.Map;

public class Date07th454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // key为和，value为计数
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        // 1.遍历nums1和nums2把和的结果放入map中
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                int sum = num1 + num2;
                int tag = map.getOrDefault(sum, 0);
                map.put(sum, ++tag);
            }
        }

        // 2.遍历nums3和nums4结合map得出数量
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                int sum = num3 + num4;
                if (map.get(-sum) != null) {
                    result += map.get(-sum);
                }
            }
        }
        return result;
    }
}
