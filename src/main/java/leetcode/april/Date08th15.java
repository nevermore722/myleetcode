package leetcode.april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Date08th15 {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1.对nums进行排序
        Arrays.sort(nums);
        // 2.for循环遍历nums，使用双指针计算返回的值
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (nums[i] > 0) {
                break;
            }
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    List<Integer> result = Arrays.asList(nums[i], nums[left], nums[right]);
                    resultList.add(result);
                    left++;
                    right--;
                }
            }
        }
        return resultList.stream().distinct().collect(Collectors.toList());
    }
}
