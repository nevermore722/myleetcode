package leetcode.august;

import java.util.Arrays;

public class Date08th496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (!flag && nums1[i] == nums2[j]) {
                    flag = true;
                } else if (flag && nums1[i] < nums2[j]) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;
    }
}
